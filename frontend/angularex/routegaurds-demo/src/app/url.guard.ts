import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, ParamMap, Router } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UrlGuard implements CanActivate {
  constructor(private router: Router){
    
  }
  
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): boolean  {
    const paramMap:ParamMap=route.paramMap;
    const idVal:any=paramMap.get('id');
    const isNotNumber:boolean=isNaN(idVal);
    if(isNotNumber){
     this.router.navigate(["/error"]);
    }
   return true;
  }
  
}
