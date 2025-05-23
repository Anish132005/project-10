import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class EndpointServiceService {

  constructor() { }

  public SERVER_URL = "http://localhost:8080";
  public MESSAGE = this.SERVER_URL + "/Message";
  public USER = this.SERVER_URL + "/User";
  public ROLE = this.SERVER_URL + "/Role";
  public COLLEGE = this.SERVER_URL + "/College";
  public MARKSHEET = this.SERVER_URL + "/Marksheet";
  public STUDENT = this.SERVER_URL + "/Student";
  public SUBJECT = this.SERVER_URL+ "/Subject";
  public FACULTY = this.SERVER_URL+ "/Faculty";
  public COURSE = this.SERVER_URL + "/Course";
  public TIMETABLE = this.SERVER_URL+ "/TimeTable";
  public BANK = this.SERVER_URL+ "/Bank";
  public ORDER = this.SERVER_URL+ "/Order";
  public PRODUCT = this.SERVER_URL+ "/Product";
  public TICKET = this.SERVER_URL+ "/Ticket";
  public PAYMENT = this.SERVER_URL+ "/Payment";
  public SHOPPINGCART = this.SERVER_URL+ "/ShoppingCart";
  public JASPERREPORT = this.SERVER_URL+ "/Jasper";
 
}
