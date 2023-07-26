/* the themes object declared below contains theme properties with 
 backgroundColor and color values

 the theme property names are matched with ids of UI input elements of type 'radio' 
 available on the index.html page

 based on the radio button selected the theme property should be selected 
 and its values should be used to style the document
*/

const themes = {
    "bright": {
        "backgroundColor": "lightyellow",
        "color": "darkgreen"
    },
    "cool": {
        "backgroundColor": "lightgray",
        "color": "indigo"
    },
    "fiery": {
        "backgroundColor": "chocolate",
        "color": "lightgoldenyellow"
    }
}

function changeTheme(event) {
    const element = event.target;
    const id = element.id;
    const theme=themes[id];
    const backgroundColor = theme.backgroundColor;
    const color = theme.color;
    document.body.style.backgroundColor = backgroundColor;
    document.body.style.color = color;

}

module.exports = changeTheme
