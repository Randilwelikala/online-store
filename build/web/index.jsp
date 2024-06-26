<%-- 
    Document   : index
    Created on : Apr 29, 2024, 1:21:52 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="style.css">
  <title>Electro Mart</title>
</head>
    <body>
  <header>
    <nav class="nav">
      <img src="images/logo.jpg" class="logo">
      <div class="nav-links">
        <ul>
          <li><a href="#">Product</a>
            <div class="sub-menu-1">
              <ul>
                <li><a href="">Overview</a></li>
                <li><a href="">Pricing</a></li>
                <li><a href="market.html">Marketplace</a></li>
                <li><a href="">Features</a></li>
                <li><a href="">Integrations</a></li>
              </ul>
            </div>
          </li>
          <li><a href="#">Company</a>
            <div class="sub-menu-1">
              <ul>
                <li><a href="/about.html">About</a></li>
                <li><a href="">Team</a></li>
                <li><a href="">Blog</a></li>
                <li><a href="">Careers</a></li>
              </ul>
            </div>
          </li>
          <li><a href="#">Admin</a>
            <div class="sub-menu-1">
              <ul>
                <li><a href="SignUpAsAdmin.jsp">Signup As Admin</a></li>
                <li><a href="LoginAsAdmin.jsp">Loging As Adminr</a></li>
                <li><a href="LogingAsSuperAdmin.jsp">super admiin login</a></li>
              </ul>
            </div>
          </li>
        </ul>
      </div>
      <div class="login-signup">
        <a href="login.jsp">Login</a> 
        <a href="signup.jsp">Sign Up</a>
      </div>
    </nav>

    <div class="header-textbox">
      <h1>A modern publishing platform</h1>
      <p>Grow your audience and build your online brand</p>
      <div class="header-textbox-2btns">
        <a href="">Start for Free</a>
        <a href="">Learn More</a>
      </div>
    </div>
  </header>
  <section class="section-1">

      <div class="section-1-topic">
         <h1>Microcontrollers: Powering Your Projects</h1>
      </div>

      <div class="section-1-textbox">
        <h3>Versatility</h3> 
        <p>Microcontrollers are small yet mighty devices that serve as the brains behind countless electronic systems. From simple tasks like turning on a light to complex automation projects, microcontrollers can handle it all. Whether you're a hobbyist tinkering in your garage or a professional developer working on cutting-edge technology, microcontrollers provide the flexibility and power you need to bring your ideas to life.<h3>Expandability</h3> 
           <p>One of the greatest advantages of microcontrollers is their ability to interface with a variety of sensors, actuators, and other peripherals. With a microcontroller at the heart of your project, you can easily integrate additional components to add new features and functionality. Want to build a weather station that monitors temperature, humidity, and rainfall? Or perhaps a smart home system that controls lights, appliances, and security cameras? With the right microcontroller and a bit of creativity, the possibilities are endless.
            </p> 
      </div>

    <div class="section-1-svg">
      <img class="section-1-svg" src="images/microchip-processor-wallpaper.jpg">
    </div>

 </section>
 
 <section class="section-2">

 <div class="section-2-svg">
  
  <img class="section-2-img-svg-phones" src="images/sensors.jpg" alt=""> 
 </div>
 <div class="section-2-textbox">
  <h3>Sensors & Modules</h3>
  <p> Offer a wide selection of sensors, modules, and components that can be used with microcontrollers, such as temperature sensors, motion detectors, GPS modules, OLED displays, motor drivers, and more. Organize these items into subcategories based on their function or type, making it easy for customers to browse and find what they need for their projects.</p>
 </div> 
</section>

<section class="section-3">
  <div class="section-3-textbox">
    <h4 class="section-3-topic">Electronic Components</h4>
   <h3>Diverse Selection, Endless Possibilities</h3> 
   <p> In the realm of electronics, innovation begins with the fundamental building blocks known as electronic components. At our shop, we take pride in offering a diverse range of these essential elements, each playing a pivotal role in bringing electronic creations to life</p>
   <h3>Diverse Selection, Endless Possibilities</h3>
   <p> Batteries included. We built a simple and straightforward CLI tool that makes customization and deployment a breeze, but
   capable of producing even the most complicated sites.</p>
  </div>
  <div class="section-3-svg">
    <img src="images/components.jpg" alt="" class="section-3-img-svg">
  </div>
</section>

<footer>
  <div class="footer-logo">
    <img src="images/logo.svg" alt="">
  </div>

  <div class="row"> 
   <h3>Product</h3>
      <ul>
   <li><a href="#">Overview</a></li>
   <li><a href="#">Pricing</a></li>
   <li><a href="#">Marketplace</a> </li>
   <li><a href="#">Features</a></li>
   <li><a href="">Integrations</a></li>
 </ul> 

  </div>
   <div class="row"> 
     <h3>Company</h3>
      <ul>
        <li><a href="#">About</a></li>
        <li><a href="#">Team</a></li>
        <li><a href="#">Blog</a></li>
        <li><a href="#">Careers</a></li>
      </ul>

    </div>
<div class="row">  
   <h3>Connect</h3>
   <ul>
      <li><a href="#">Contact</a></li>
      <li><a href="#">Newsletter</a></li>
      <li><a href="#">LinkedIn</a></li> 
   </ul>
</div>
</footer>

</body>


</html>
