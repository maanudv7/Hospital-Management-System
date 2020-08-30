<%-- 
    Document   : update_patient
    Created on : 2 Jul, 2020, 12:08:24 AM
    Author     : Himanshu Sharma
--%>

<%@page import="com.bean.Patient"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Update</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="assets/css/-Login-form-Page-BS4-.css">
    <link rel="stylesheet" href="assets/css/Footer-Basic.css">
    <link rel="stylesheet" href="assets/css/Login-Form-Dark.css">
    <link rel="stylesheet" href="assets/css/Navigation-Clean.css">
    <link rel="stylesheet" href="assets/css/Pretty-Registration-Form.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body style="background-image: url(&quot;assets/img/Horizon.jpg&quot;);">
    <nav class="navbar navbar-light navbar-expand-md navigation-clean" style="background-color: rgb(0,51,91);">
        <div class="container"><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon" style="color: #c4d3dd;"></span></button>
            <p style="color: #e0ddbc;font-size: 30px;font-family: Poppins, sans-serif;margin-bottom: 8px;">ABC HOSPITAL</p>
            <div class="collapse navbar-collapse" id="navcol-1" style="height: 47px;">
                <ul class="nav navbar-nav ml-auto" style="margin-left: 725px;padding-right: 0px;">
                    <li class="nav-item dropdown "><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#" style="color: #c4d3dd;margin-right: 72px;font-size: 19px;">Patient</a>
                        <div class="dropdown-menu " role="menu" style="background-color: #00335b;">
                                <a class="dropdown-item" role="presentation" href="patient_register.html" style="color: #c4d3dd;">Registration</a>
                                <a class="dropdown-item" role="presentation" href="update_patient.jsp" style="color: #c4d3dd;">Update Details</a>
                                <a class="dropdown-item" role="presentation" href="Delete_patient.jsp" style="color: #c4d3dd;">Delete Patient</a>
                                <a class="dropdown-item" role="presentation" href="Search_patient.jsp" style="color: #c4d3dd;">Search Patients</a>
                                <a class="dropdown-item" role="presentation" href="discharge_patient.html" style="color: #c4d3dd;">Discharge Patient</a>
                                <a class="dropdown-item" role="presentation" href="billing_detail.html" style="color: #c4d3dd;">Billing Details</a>
                                <a class="dropdown-item" role="presentation" href="view_patients.html" style="color: #c4d3dd;">View Patients</a></div>
                    </li>
                    <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#" style="color: #c4d3dd;margin-right: 70px;font-size: 19px;">Pharmacy</a>
                        <div class="dropdown-menu" role="menu" style="background-color: #00335b;"><a class="dropdown-item" role="presentation" href="medicine_issue.html" style="color: #c4d3dd;">Medicine Issued</a><a class="dropdown-item" role="presentation" href="new_medicine_issue.html" style="color: #c4d3dd;">Issue New Medicine</a>
                            <a
                                class="dropdown-item" role="presentation" href="medicine_stock.html" style="color: #c4d3dd;">Stock</a><a class="dropdown-item" role="presentation" href="add_new_medicine.html" style="color: #c4d3dd;">Add New Medicine</a></div>
                    </li>
                    <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#" style="color: #c4d3dd;font-size: 19px;">Diagnostics</a>
                        <div class="dropdown-menu" role="menu" style="background-color: #00335b;"><a class="dropdown-item" role="presentation" href="diagnostics_done.html" style="color: #c4d3dd;">Diagonstics Done</a><a class="dropdown-item" role="presentation" href="new_diagnostic.html" style="color: #c4d3dd;">Allot New Test</a>
                            <a
                                class="dropdown-item" role="presentation" href="diagnostics_list.html" style="color: #c4d3dd;">List Of Tests</a><a class="dropdown-item" role="presentation" href="add_new_diagnostics.html" style="color: #c4d3dd;">Add New Diagnostics</a></div>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    
  <%--
  One possible method is this->
        if (request.getAttribute("data") != null) {
                    ArrayList al = (ArrayList) request.getAttribute("data");
                    Iterator itr = al.iterator();
                    while (itr.hasNext()) {
        
        }
  
  
  <%= request.getAttribute("add") %>   <-----  This is also the way to fetch values, but it shows null by default
   That's why ${xyz} method used.
        --%>
    
    
    <div class="row register-form" style="padding-right: 0;">
        <div class="col-md-8 offset-md-2">
            <form class="custom-form"  action="UpdateServ" style="background-color: rgba(71,186,235,0.13);padding: 55px;padding-top: 25px;padding-bottom: 25px;margin-top: 25px;margin-bottom: 25px;margin-right: 25px;margin-left: 25px;">
                <h1 style="margin-bottom: 45px;">Update Patient</h1>
                <div class="form-row form-group" style="margin-bottom: 5px;">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="name-input-field" style="font-size: 16px;padding-right: 5px;">Patient SSN ID</label></div>
                    <div class="col-sm-6 input-column"><input class="form-control" type="text" name="ssnid" value="${ssnid}" style="background-color: #ffffff;" required=""></div>
                </div>
                
                <button class="btn btn-light submit-button" name="action" value="get" style="margin: 10px;padding: 10px;">Get</button>
                
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="email-input-field" style="font-size: 16px;padding-right: 5px;">Patient Name</label></div>
                    <div class="col-sm-6 input-column"><input class="form-control" type="text" name="name" value="${name}"></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="pawssword-input-field" style="font-size: 16px;padding-right: 5px;">Patient Age</label></div>
                    <div class="col-sm-6 input-column"><input class="form-control" type="text" name="age" value="${age}" ></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="repeat-pawssword-input-field" style="font-size: 16px;padding-right: 5px;">Date Of Admission</label></div>
                    <div class="col-sm-6 input-column"><input class="form-control" name="dateodadmission" type="date" value="${doj}" ></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="dropdown-input-field" style="font-size: 16px;padding-right: 5px;">Type Of Bed</label></div>
                    <div class="col-sm-4 input-column"><select class="form-control" name="bedtype" value="${bed}" ><option>${bed}</option><option value="ICU">ICU</option><option value="NICU">NICU</option><option value="Private Room">Private Room</option><option value="General Ward">General Ward</option></select></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="dropdown-input-field" style="font-size: 16px;padding-right: 5px;">Address</label></div>
                    <div class="col-sm-4 input-column"><textarea class="form-control" name="addr" style="height: 85px;width: 225px;"  > ${add} </textarea></div> 
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="dropdown-input-field" style="font-size: 16px;padding-right: 5px;">State</label></div>
                    <div class="col-sm-4 input-column"><select class="form-control states order-alpha" value="${state}" name="state" ><option>${state}</option><option value="Madhya Pradesh">Madhya Pradesh</option><option value="Rajasthan">Rajasthan</option><option value="Haryana">Haryana</option><option value="Maharashtra">Maharashtra</option><option value="Tamil Nadu">Tamil Nadu</option></select></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="dropdown-input-field" style="font-size: 16px;padding-right: 5px;">City</label></div>
                    <div class="col-sm-4 input-column"><select class="form-control order-alpha limit-pop-10000"  name="city" value="${city}" ><option>${city}</option><option value="Bhopal">Bhopal</option><option value="Indore">Indore</option><option value="Jaipur">Jaipur</option><option value="Jodhpur">Jodhpur</option><option value="Gurugram">Gurugram</option><option value="Pune">Pune</option><option value="Mumbai">Mumbai</option><option value="Chennai">Chennai</option></select></div>
                </div>
                
                <button class="btn btn-light submit-button" name="action" value="update"  style="margin: 0;">Update</button>
            </form>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
     
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>

</html>