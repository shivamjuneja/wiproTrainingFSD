package com.stackroute.newz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.newz.model.News;
import com.stackroute.newz.repository.NewsRepository;
import com.stackroute.newz.service.NewsService;
import com.stackroute.newz.util.exception.NewsAlreadyExistsException;
import com.stackroute.newz.util.exception.NewsNotExistsException;


/*
 * This class is implementing the NewsService interface. This class has to be annotated with
 * @Service annotation.
 * @Service - is an annotation that annotates classes at the service layer, thus
 * clarifying it's role.
 *
 * */

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;


    /*
     * Add a new news. Throw NewsAlreadyExistsException if the news with specified
     * newsId already exists.
     */
    @Override
    public News addNews(News news) throws NewsAlreadyExistsException {
        News found = newsRepository.getOne(news.getNewsId());
        if (found != null) {
            throw new NewsAlreadyExistsException();
        }
        news = newsRepository.save(news);
        return news;
    }

    /*
     * Retrieve an existing news by it's newsId. Throw NewsNotExistsException if the
     * news with specified newsId does not exist.
     */
    @Override
    public News getNews(int newsId) throws NewsNotExistsException {
        Optional<News> optional = newsRepository.findById(newsId);
        if (!optional.isPresent()) {
            throw new NewsNotExistsException();
        }
        return optional.get();
    }

    /*
     * Retrieve all existing news
     */
    @Override
    public List<News> getAllNews() {

        return newsRepository.findAll();
    }


    /*
     * Update an existing news by it's newsId. Throw NewsNotExistsException if the
     * news with specified newsId does not exist.
     */
    @Override
    public News updateNews(News news) throws NewsNotExistsException {
      News found=newsRepository.getOne(news.getNewsId());
      if(found==null){
          throw new NewsNotExistsException();
      }
      newsRepository.saveAndFlush(news);
      return news;
    }

    /*
     * Delete an existing news by it's newsId. Throw NewsNotExistsException if the
     * news with specified newsId does not exist.
     */
    @Override
    public void deleteNews(int newsId) throws NewsNotExistsException {
      News news=  newsRepository.getOne(newsId);
      if(news==null){
          throw new NewsNotExistsException();
      }
      newsRepository.deleteById(newsId);
    }

}
