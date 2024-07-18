package org.pojo;


import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass extends BaseClass {
public Pojoclass() {
PageFactory.initElements(driver, this);
}

@FindBy(id="email")
private WebElement txtemail;

@FindBy(id="pass")
private WebElement txtpass;

@FindBy(name="login")
private WebElement btnlogin;

public WebElement getTxtemail() {
	return txtemail;
}

public WebElement getTxtpass() {
	return txtpass;
}

public WebElement getBtnlogin() {
	return btnlogin;
}

@FindBy(xpath="(//span[text()='Sign in'])[2]")
private WebElement amazonclksignin;

public WebElement getAmazonclksignin() {
	return amazonclksignin;
}

@FindBy(name="email")
private WebElement amazonemail;

public WebElement getAmazonemail() {
	return amazonemail;
}

@FindBy(id="continue")
private WebElement amazoncnt;

public WebElement getAmazoncnt() {
	return amazoncnt;
}

@FindBy(name="password")
private WebElement amazonpass;

public WebElement getAmazonpass() {
	return amazonpass;
}

@FindBy(id="signInSubmit")
private WebElement amazonsignin;

public WebElement getAmazonsignin() {
	return amazonsignin;
}

@FindBy(xpath="//h2[text()='Today’s Deals']")
private WebElement scroll;

public WebElement getScroll() {
	return scroll;
}

@FindAll({
@FindBy(name="email"),
@FindBy(id="email"),
})
private WebElement fbemail;

public WebElement getFbemail() {
	return fbemail;
}
@CacheLookup
@FindAll({
@FindBy(id="pass"),
@FindBy(name="pass")	
})
private WebElement fbpass;

public WebElement getFbpass() {
	return fbpass;
}

@FindAll({
	@FindBy(id="loginbutton"),
	@FindBy(name="login")	
})
private WebElement fblogin;

public WebElement getFblogin() {
	return fblogin;
}

@FindBy(xpath="//span[text()='Greens Technology Adyar']")
private WebElement greenscrolldown;

public WebElement getGreenscrolldown() {
	return greenscrolldown;
}
@FindBy(xpath="//h1[contains(text(),'No 1 Software Training')]")
private WebElement greenscrollup;

public WebElement getGreenscrollup() {
	return greenscrollup;
}

@FindBy(xpath="//a[text()='Certifications']")
private WebElement greencert;


@FindBy(xpath="(//h1[text()='SELENIUM'])[2]")
private WebElement greenselenium;

@FindBy(xpath="(//a[text()='Course Content'])[40]")
private WebElement couresecontent;


@FindBy(xpath="//h2[text()='Selenium Training in Chennai']")
private WebElement greentitle;

public WebElement getGreencert() {
	return greencert;
}

public WebElement getGreenselenium() {
	return greenselenium;
}

public WebElement getCouresecontent() {
	return couresecontent;
}

public WebElement getGreentitle() {
	return greentitle;
}

@FindBy(xpath="//a[text()='COURSES']")
private WebElement clkcourse;

public WebElement getClkcourse() {
	return clkcourse;
}

@FindBy(xpath="//span[text()='Java Training']")
private WebElement javatraining;

public WebElement getJavatrainig() {
	return javatraining;
}

@FindBy(xpath="//span[text()='Core Java Training']")
private WebElement corejava;

public WebElement getCorejava() {
	return corejava;
}

public WebElement getJavatraining() {
	return javatraining;
}

@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
private WebElement anitha;

public WebElement getAnitha() {
	return anitha;
}

@FindBy(xpath="//a[text()='CAREERS']")
private WebElement greencareer;

@FindBy(xpath="//a[text()='www.greenstechnologys.com.']")
private WebElement greenemail;

public WebElement getGreencareer() {
	return greencareer;
}

public WebElement getGreenemail() {
	return greenemail;
}

@FindBy(xpath="//a[text()='TESTIMONIALS']")
private WebElement greentesti;

@FindBy(xpath="//a[text()='+91 8939 915 572 ']")
private WebElement greenph;

@FindBy(xpath="//div[contains(text(),'learnt lots of things in both')]")
private WebElement reviews;

public WebElement getGreentesti() {
	return greentesti;
}

public WebElement getGreenph() {
	return greenph;
}

public WebElement getReviews() {
	return reviews;
}

@FindBy(xpath="//a[text()='CONTACT US']")
private WebElement greenconus;

@FindBy(xpath="//h3[contains(text(),'Our Main')]")
private WebElement ourmain;

@FindBy(xpath="//p[contains(text(),'Copyright © 2023')]")
private WebElement copyright;


public WebElement getGreenconus() {
	return greenconus;
}

public WebElement getOurmain() {
	return ourmain;
}

public WebElement getCopyright() {
	return copyright;
}

@FindAll({
@FindBy(id="username"),
@FindBy(name="username"),
@FindBy(className="text")
})
private WebElement adhocid;

@FindAll({
@FindBy(id="password"),
@FindBy(className="password"),
@FindBy(name="password")
})
private WebElement adhocpass;

@FindBy(id="login")
private WebElement adhoclogin;

public WebElement getAdhocid() {
	return adhocid;
}

public WebElement getAdhocpass() {
	return adhocpass;
}

public WebElement getAdhoclogin() {
	return adhoclogin;
}
@FindAll({
	@FindBy(id="location"),
	@FindBy(name="location")	
})
private WebElement adhoclocation;

public WebElement getAdhoclocation() {
	return adhoclocation;
}

@FindAll({
	@FindBy(id="hotels"),
	@FindBy(name="hotels")	
})
private WebElement adhochotel;



@FindAll({
	@FindBy(id="room_type"),
	@FindBy(name="room_type")	
})
private WebElement adhocroom;

@FindAll({
	@FindBy(id="room_nos"),
	@FindBy(name="room_nos")	
})
private WebElement adhocroomnum;

@FindAll({
	@FindBy(id="datepick_in"),
	@FindBy(name="datepick_in")	
})
private WebElement adhocroomcheckin;

@FindAll({
	@FindBy(id="datepick_out"),
	@FindBy(name="datepick_out")	
})
private WebElement adhocroomcheckout;

@FindAll({
	@FindBy(id="adult_room"),
	@FindBy(name="adult_room")	
})
private WebElement adhocroomadult;

@FindAll({
	@FindBy(id="child_room"),
	@FindBy(name="child_room")	
})
private WebElement adhocroomchild;

@FindAll({
	@FindBy(id="Submit"),
	@FindBy(name="Submit")	
})
private WebElement adhocroomsearch;

public WebElement getAdhochotel() {
	return adhochotel;
}

public WebElement getAdhocroom() {
	return adhocroom;
}

public WebElement getAdhocroomnum() {
	return adhocroomnum;
}

public WebElement getAdhocroomcheckin() {
	return adhocroomcheckin;
}

public WebElement getAdhocroomcheckout() {
	return adhocroomcheckout;
}

public WebElement getAdhocroomadult() {
	return adhocroomadult;
}

public WebElement getAdhocroomchild() {
	return adhocroomchild;
}

public WebElement getAdhocroomsearch() {
	return adhocroomsearch;
}

@FindAll({
	@FindBy(id="select_form"),
	@FindBy(name="select_form")	
})
private WebElement adhocselecthotel;

public WebElement getAdhocselecthotel() {
	return adhocselecthotel;
}

@FindAll({
	@FindBy(id="radiobutton_0"),
	@FindBy(name="radiobutton_0")	
})
private WebElement adhocradio;

public WebElement getAdhocradio() {
	return adhocradio;
}

@FindAll({
	@FindBy(id="continue"),
	@FindBy(name="continue")	
})
private WebElement adhoccontinue;

public WebElement getAdhoccontinue() {
	return adhoccontinue;
}

@FindAll({
	@FindBy(id="first_name"),
	@FindBy(name="first_name")	
})
private WebElement adhocfirstname;

public WebElement getAdhocfirstname() {
	return adhocfirstname;
}

@FindAll({
	@FindBy(id="last_name"),
	@FindBy(name="last_name")	
})
private WebElement adhoclastname;

public WebElement getAdhoclastname() {
	return adhoclastname;
}

@FindAll({
	@FindBy(id="address"),
	@FindBy(name="address")	
})
private WebElement adhocbillingaddress;

public WebElement getAdhocbillingaddress() {
	return adhocbillingaddress;
}

@FindAll({
	@FindBy(id="cc_num"),
	@FindBy(name="cc_num")	
})
private WebElement adhocccnum;

public WebElement getAdhocccnum() {
	return adhocccnum;
}

@FindAll({
	@FindBy(id="cc_type"),
	@FindBy(name="cc_type")	
})
private WebElement adhoccctype;

public WebElement getAdhoccctype() {
	return adhoccctype;
}

@FindAll({
	@FindBy(id="cc_exp_month"),
	@FindBy(name="cc_exp_month")	
})
private WebElement adhocccexmonth;

public WebElement getAdhocccexmonth() {
	return adhocccexmonth;
}

@FindAll({
	@FindBy(id="cc_exp_year"),
	@FindBy(name="cc_exp_year")	
})
private WebElement adhocccexyear;

public WebElement getAdhocccexyear() {
	return adhocccexyear;
}

@FindAll({
	@FindBy(id="cc_cvv"),
	@FindBy(name="cc_cvv")	
})
private WebElement adhoccvvnumber;

public WebElement getAdhoccvvnumber() {
	return adhoccvvnumber;
}

@FindAll({
	@FindBy(id="book_now"),
	@FindBy(name="book_now")	
})
private WebElement adhocbooknow;

public WebElement getAdhocbooknow() {
	return adhocbooknow;
}

@FindAll({
	@FindBy(id="order_no"),
	@FindBy(name="order_no")	
})
private WebElement adhocordernum;

public WebElement getAdhocordernum() {
	return adhocordernum;
}

@FindBy(xpath="//span[text()='Account']")
private WebElement redbusacc;	

public WebElement getRedbusacc() {
	return redbusacc;
}

@FindBy(xpath="//span[text()='Login/ Sign Up']")
private WebElement redbuslogin;

public WebElement getRedbuslogin() {
	return redbuslogin;
}


@FindBy(id="mobileNoInp")
private WebElement redbusmobileno;

public WebElement getRedbusmobileno() {
	return redbusmobileno;
}

@FindBy(id="rc-anchor-container")
private WebElement redbusrobot;

public WebElement getRedbusrobot() {
	return redbusrobot;
}

@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement flipmobile;

@FindBy(xpath="//button[text()='Request OTP']")
private WebElement flipotp;





}








