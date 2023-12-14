import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { HistoryComponent } from './pages/history/history.component';
import { LiveComponent } from './pages/live/live.component';
import { PointTableComponent } from './pages/point-table/point-table.component';

export const routes: Routes = [
    
    {
        path:'',
        redirectTo:'/live',
        pathMatch:'full'

    },
    {
        path:"home",
        component:HomeComponent,
        title:"Home | Crickinformer"
    },
    {
        path:"history",
        component:HistoryComponent,
        title:"Match History | Crickinformer"
    },
    {
        path:"live",
        component:LiveComponent,
        title:"Live Matches | Crickinformer"
    },
    {
        path:"point-table",
        component:PointTableComponent,
        title:"Point Table"
    }
];
 