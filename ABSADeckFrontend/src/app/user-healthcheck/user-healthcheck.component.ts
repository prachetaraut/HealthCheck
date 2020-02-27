import { Component, OnInit } from '@angular/core';
import { HealthService } from './health.service';
import { Health } from '../_models/health'

@Component({
  selector: 'app-user-healthcheck',
  templateUrl: './user-healthcheck.component.html',
  styleUrls: ['./user-healthcheck.component.css']
})
export class UserHealthcheckComponent implements OnInit {

    healths : Health[];

  constructor(private healthService : HealthService) { }

  ngOnInit() {
    this.healthService.getAllHealth().subscribe(data => {
      this.healths = data;
    })
   }

}
