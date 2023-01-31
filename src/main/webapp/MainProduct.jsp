<%@page import="bean.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style4.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style5.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style6.css"/>
    <title>Nike</title>
</head>
<body>
<!-- NavBar head -->
<nav class="navbar navbar-expand-sm navbar-light bg-dark py-lg-0">
    <div class="container-fluid ms-2 me-5">
        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-alexa" viewBox="0 0 16 16">
            <path d="M7.996 0A7.998 7.998 0 0 0 0 8a8 8 0 0 0 6.93 7.93v-1.613a1.06 1.06 0 0 0-.717-1.008A5.602 5.602 0 0 1 2.4 7.865 5.579 5.579 0 0 1 8.054 2.4a5.599 5.599 0 0 1 5.535 5.81l-.002.046a6.116 6.116 0 0 1-.012.192l-.005.061a4.85 4.85 0 0 1-.033.284l-.01.068c-.685 4.516-6.564 7.054-6.596 7.068A7.998 7.998 0 0 0 15.992 8 7.998 7.998 0 0 0 7.996.001Z"/>
        </svg>
        <div class="navbar end-0">
            <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link active text-white" aria-current="page" href="#">Find a Store</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle active text-white" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown">
                    Help
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                <li><a class="dropdown-item" href="#">Action</a></li>
                <li><a class="dropdown-item" href="#">Another action</a></li>
                <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
            </li>
            <li class="nav-item">
                <a class="nav-link active text-white" href="#">Join Us</a>
            </li>
            <li class="nav-item">
                    <% User user = (User)request.getSession().getAttribute("user"); %>
                    <% if(user == null){ %>
                    <a class="nav-link active text-white" href="Login.jsp">Sign In</a>
                    <% }else {%>
                    
                    
                    
                  <a class="nav-link active text-white" href="#"><%=user.getName() %></a>
                    
                    
                    
                    
                    
                    <% }%>
                   
                </li>
            </ul>
        </div>
    </div>
</nav>
<!-- NavBar head -->
<!-- NavBar head 2 -->
<div class="navbar-cus">
    <ul>
        <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" fill="currentColor" class="bi bi-alipay logo" viewBox="0 0 16 16">
            <path d="M2.541 0H13.5a2.551 2.551 0 0 1 2.54 2.563v8.297c-.006 0-.531-.046-2.978-.813-.412-.14-.916-.327-1.479-.536-.303-.113-.624-.232-.957-.353a12.98 12.98 0 0 0 1.325-3.373H8.822V4.649h3.831v-.634h-3.83V2.121H7.26c-.274 0-.274.273-.274.273v1.621H3.11v.634h3.875v1.136h-3.2v.634H9.99c-.227.789-.532 1.53-.894 2.202-2.013-.67-4.161-1.212-5.51-.878-.864.214-1.42.597-1.746.998-1.499 1.84-.424 4.633 2.741 4.633 1.872 0 3.675-1.053 5.072-2.787 2.08 1.008 6.37 2.738 6.387 2.745v.105A2.551 2.551 0 0 1 13.5 16H2.541A2.552 2.552 0 0 1 0 13.437V2.563A2.552 2.552 0 0 1 2.541 0Z"/>
            <path d="M2.309 9.27c-1.22 1.073-.49 3.034 1.978 3.034 1.434 0 2.868-.925 3.994-2.406-1.602-.789-2.959-1.353-4.425-1.207-.397.04-1.14.217-1.547.58Z"/>
        </svg>
        <li>
           
            <a href ="ManagerServlet?person=Man" class="nut_dropdown" id="nut_dropdown_man">Man </a>
        </li>
        <li>
            <button class="nut_dropdown" id="nut_dropdown">Woman</button>
        </li>
        <li>
            <button class="nut_dropdown" id="nut_dropdown">Kids</button>
        </li>
        <li>
            <button class="nut_dropdown" id="nut_dropdown">Customise</button>
        </li>
        <li>
            <button class="nut_dropdown" id="nut_dropdown">Sale</button>
        </li>
        <li>
            <button class="nut_dropdown" id="nut_dropdown">SNKRS</button>
        </li>
    </ul>
</div>
<div class="noi-dung" id="noi_dung">
        <ul>
             <li>
                    <a href="ManagerServlet?person=Man&mod=Shoes">Giày</a>
                </li>
                <li>
                   <a href ="ManagerServlet?person=Man&mod=Shirt"> Áo</a>
                </li>
                <li>
                    <a href = ""> Quần</a>
                </li>
                 <li>
                    <a href ="ManagerServlet?person=Man&mod=Cap" > Mũ </a>
                </li>
        </ul>
</div>
<!-- NavBar head 2 -->
 <% List<Item> items = (List<Item>)request.getSession().getAttribute("showByKey"); %>
<div class="body clearfix">
    <div class="boby-menu clearfix">
        <span>Men's Shoes ( <%= items.size() %> )</span>
        <div class="menu-category">
            <ul>
                <li>Lifestyle</li>
                <li>Jordan</li>
                <li>Running</li>
                <li>Basketball</li>
                <li>Football</li>
                <li>Trainning & Gym</li>
                <li>Walking</li>
            </ul>
        </div>
        <div>

        </div>
    </div>
    <div class="body-itemshow">
        <div class="item-filter">
            <div class="filter-items">
                Filter
            </div>
            <div class="sort-items">
                Sort By
            </div>
        </div>
        

       
        
        <div class="item-show">
            <ul class="mystyle-products">
            <% for(int i = 0; i < items.size(); i ++) { %>
            
            <li class="product">
                    <img alt="" class="attachment-shop_catalog " src="<%= items.get(i).getImageURL() %>" />
                    <span class="status">Just In</span>
                    <span class="name"> <%= items.get(i).getNameItem() %></span>
                    <span class="category"><%= items.get(i).getCataloryItem() %></span>
                    <span class="colors"><%= items.get(i).getColorItem() %></span>
                    <span class="colors"><%= items.get(i).getSizeItem() %></span>
                    <span class="price"><%= items.get(i).getPriceItem() %></span>                   
            </li>
           
            <% } %>
            </ul>
            
        </div>
    </div>
</div>







<div style="height: 1000px;">

</div>

<!-- Footer -->
<footer class="text-center text-lg-start bg-light text-muted">
<!-- Section: Social media -->
<section class="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">
  <!-- Left -->
  <div class="me-5 d-none d-lg-block">
    <span>Get connected with us on social networks:</span>
  </div>
  <!-- Left -->

  <!-- Right -->
  <div>
    <a href="" class="me-4 text-reset">
      <i class="fab fa-facebook-f"></i>
    </a>
    <a href="" class="me-4 text-reset">
      <i class="fab fa-twitter"></i>
    </a>
    <a href="" class="me-4 text-reset">
      <i class="fab fa-google"></i>
    </a>
    <a href="" class="me-4 text-reset">
      <i class="fab fa-instagram"></i>
    </a>
    <a href="" class="me-4 text-reset">
      <i class="fab fa-linkedin"></i>
    </a>
    <a href="" class="me-4 text-reset">
      <i class="fab fa-github"></i>
    </a>
  </div>
  <!-- Right -->
</section>
<!-- Section: Social media -->

<!-- Section: Links  -->
<section class="">
  <div class="container text-center text-md-start mt-5">
    <!-- Grid row -->
    <div class="row mt-3">
      <!-- Grid column -->
      <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
        <!-- Content -->
        <h6 class="text-uppercase fw-bold mb-4">
          <i class="fas fa-gem me-3"></i>Company name
        </h6>
        <p>
          Here you can use rows and columns to organize your footer content. Lorem ipsum
          dolor sit amet, consectetur adipisicing elit.
        </p>
      </div>
      <!-- Grid column -->

      <!-- Grid column -->
      <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">
        <!-- Links -->
        <h6 class="text-uppercase fw-bold mb-4">
          Products
        </h6>
        <p>
          <a href="#!" class="text-reset">Angular</a>
        </p>
        <p>
          <a href="#!" class="text-reset">React</a>
        </p>
        <p>
          <a href="#!" class="text-reset">Vue</a>
        </p>
        <p>
          <a href="#!" class="text-reset">Laravel</a>
        </p>
      </div>
      <!-- Grid column -->

      <!-- Grid column -->
      <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
        <!-- Links -->
        <h6 class="text-uppercase fw-bold mb-4">
          Useful links
        </h6>
        <p>
          <a href="#!" class="text-reset">Pricing</a>
        </p>
        <p>
          <a href="#!" class="text-reset">Settings</a>
        </p>
        <p>
          <a href="#!" class="text-reset">Orders</a>
        </p>
        <p>
          <a href="#!" class="text-reset">Help</a>
        </p>
      </div>
      <!-- Grid column -->

      <!-- Grid column -->
      <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
        <!-- Links -->
        <h6 class="text-uppercase fw-bold mb-4">Contact</h6>
        <p><i class="fas fa-home me-3"></i> New York, NY 10012, US</p>
        <p>
          <i class="fas fa-envelope me-3"></i>
          info@example.com
        </p>
        <p><i class="fas fa-phone me-3"></i> + 01 234 567 88</p>
        <p><i class="fas fa-print me-3"></i> + 01 234 567 89</p>
      </div>
      <!-- Grid column -->
    </div>
    <!-- Grid row -->
  </div>
</section>
<!-- Section: Links  -->

<!-- Copyright -->
<div class="text-center p-4" style="background-color: rgba(0, 0, 0, 0.05);">
  © 2021 Copyright:
  <a class="text-reset fw-bold" href="https://mdbootstrap.com/">MDBootstrap.com</a>
</div>
<!-- Copyright -->
</footer>
<!-- Footer -->

<script>
    const nut_drop_man = document.getElementById("nut_dropdown_man");
    const drop_down = document.getElementById("noi_dung");

    nut_drop_man.onmouseover = function() {
        drop_down.style.opacity = 1;
        drop_down.style.visibility = "visible"
    };
    nut_drop_man.onmouseout = function() {
        drop_down.style.opacity = 0;
        drop_down.style.visibility = "hidden"
    };

    drop_down.onmouseover = function() {
        drop_down.style.opacity = 1;
        drop_down.style.visibility = "visible"
    };

    drop_down.onmouseout = function() {
        drop_down.style.opacity = 0;
        drop_down.style.visibility = "hidden"
    };

</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>
