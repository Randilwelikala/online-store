<%-- 
    Document   : index
    Created on : Apr 24, 2024, 8:41:40 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <title>shop</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        .top_bar {
            background: #003D29;
            width: 100vw;
            padding: 10px 20px;
            color: white;
            display: flex;
            align-items: center;
            justify-content: space-between;
        }
        .top_bar > .second {
            display: flex;
            gap: 10px;
        }
        .main {
            padding: 40px 80px;
        }
        .body_navbar {
            display: flex;
            align-items: center;
            justify-content: space-between;
        }
        input {
            padding: 10px;
            width: 400px;
        }
        .navitem_list {
            display: flex;
            align-items: center;
            gap: 20px;
        }
        .navitem_list p {
            display: flex;
            align-items: center;
            gap: 5px;
        }
        button {
            background: black;
            color: white;
            font-weight: bold;
            padding: 10px;
        }
        .pink-box {
            background-color: pink;
            margin-top: 40px;
            height: 100vh;
            padding: 10px 20px;
        }
        .text-between {
            text-align: center;
            margin-top: 15px;
            font-size: 24px;
            font-weight: 900;
            color: brown;
        }
        .products {
            display: grid;
            grid-template-columns: 20% 20% 20% 20%;
            justify-content: space-between;
        }
        .product {
            border: 1px solid black;
            padding: 10px;
            margin: 10px;
            background: pink;
            height: 250px;
        }
        .ads {
            background: #FFF455;
            height: 30vh;
            margin-top: 30px;
            border-radius: 14px;
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 50px;
            position: relative;
            overflow: hidden;
        }
        .adsimage {
            height: 30vh;
            width: 20vw;
            animation: imageSlide 3s infinite alternate;
        }
        @keyframes imageSlide {
            0% {
                transform: translateX(-50%);
            }
            100% {
                transform: translateX(50%);
            }
        }
    </style>
</head>
<body>
    <div class="top_bar">
        <div>0771243316</div>
        <div class="second">
            <p>Eng</p>
            <p>Country</p>
        </div>
    </div>
    <div class="main">
        <div class="body_navbar">
            <div><input type="text" placeholder="search..."></div>
            <div class="navitem_list">
                <p><span class="material-symbols-outlined">shopping_cart</span> Cart</p>
                <p><span class="material-symbols-outlined">inventory</span> Order</p>
                <p><span class="material-symbols-outlined">person</span> Accounts</p>
            </div>
        </div>
        <div class="ads">
            <div>
                <h1>Grab up to 20% off <br>Limited items</h1>
                <button>Buy Now</button>
            </div> 
            <div>
                <img class="adsimage" src="https://www.edataindia.com/wp-content/uploads/2021/08/ecommerce-1.png"/>
            </div>
        </div>
        <div class="text-between">Computers</div>
        <div class="products">
           <c:forEach var="oneproduct" items="${allproduct}">
    <div class="product">
        <h2><c:out value="${oneproduct.name}" /></h2>  
        <h2><c:out value="${oneproduct.price}" /></h2>  
        
    </div>   
</c:forEach>

        </div>
    </div>
</body>
</html>