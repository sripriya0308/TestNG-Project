package org.locators.test;

import java.util.concurrent.TimeUnit;

import org.base.test.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPojo extends BaseClass {
	
	
	public HotelPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement logn;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement roomno;
	
	@FindBy(id="datepick_in")
	private WebElement chkin;
	
	
	@FindBy(id="datepick_out")
	private WebElement chkout;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	

	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radio;	
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement addr;
	
	@FindBy(id="cc_num")
	private WebElement credit;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement ctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	@FindBy(id="continue")
	private WebElement cont;
	
	@FindBy(id="order_no")
	WebElement orderNo;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	
	@FindBy(xpath="//a[text()='Click here to login again']")
	WebElement loginag;	

	


	public WebElement getUser() {
		return user;
	}

	public void setUser(WebElement user) {
		this.user = user;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getLogn() {
		return logn;
	}

	public void setLogn(WebElement logn) {
		this.logn = logn;
	}

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(WebElement roomtype) {
		this.roomtype = roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public void setRoomno(WebElement roomno) {
		this.roomno = roomno;
	}

	public WebElement getChkin() {
		return chkin;
	}

	public void setChkin(WebElement chkin) {
		this.chkin = chkin;
	}

	public WebElement getChkout() {
		return chkout;
	}

	public void setChkout(WebElement chkout) {
		this.chkout = chkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public void setAdult(WebElement adult) {
		this.adult = adult;
	}

	public WebElement getChild() {
		return child;
	}

	public void setChild(WebElement child) {
		this.child = child;
	}

	public WebElement getRadio() {
		return radio;
	}

	public void setRadio(WebElement radio) {
		this.radio = radio;
	}

	public WebElement getFname() {
		return fname;
	}

	public void setFname(WebElement fname) {
		this.fname = fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public void setLname(WebElement lname) {
		this.lname = lname;
	}

	public WebElement getAddr() {
		return addr;
	}

	public void setAddr(WebElement addr) {
		this.addr = addr;
	}

	public WebElement getCredit() {
		return credit;
	}

	public void setCredit(WebElement credit) {
		this.credit = credit;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public void setCtype(WebElement ctype) {
		this.ctype = ctype;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getCvv() {
		return cvv;
		
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public void setBook(WebElement book) {
		this.book = book;
	}
	
	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	
	public WebElement getCont() {
		return cont;
	}

	public void setCont(WebElement cont) {
		this.cont = cont;
	}
	
	
	public WebElement getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(WebElement orderNo) {
		this.orderNo = orderNo;
	}
	
	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}

	public WebElement getLoginag() {
		return loginag;
	}

	public void setLoginag(WebElement loginag) {
		this.loginag = loginag;
	}
	
	
	
	
	
	
	
	
	

}
