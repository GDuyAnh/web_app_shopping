<%@page import="bean.User"%>
<%@page import="bean.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_template.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_itemsShow.css">

  <title>Items</title>
</head>
<body>
	<!-- Template -->
  <!-- NavBar head -->
  <nav class="navbar navbar-expand navbar-light py-lg-0" style="background-color: #f5f5f5;max-height: 33px;">
    <div class="container-fluid ms-2 me-5">
      <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-alexa"
        viewBox="0 0 16 16">
        <path
          d="M7.996 0A7.998 7.998 0 0 0 0 8a8 8 0 0 0 6.93 7.93v-1.613a1.06 1.06 0 0 0-.717-1.008A5.602 5.602 0 0 1 2.4 7.865 5.579 5.579 0 0 1 8.054 2.4a5.599 5.599 0 0 1 5.535 5.81l-.002.046a6.116 6.116 0 0 1-.012.192l-.005.061a4.85 4.85 0 0 1-.033.284l-.01.068c-.685 4.516-6.564 7.054-6.596 7.068A7.998 7.998 0 0 0 15.992 8 7.998 7.998 0 0 0 7.996.001Z" />
      </svg>
      <div class="navbar end-0">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link active text-black" aria-current="page" href="#">Find a Store</a>
          </li>
          <li class="line-top"><span>|</span></li>
          <li class="nav-item">
            <div class="dropdown" style="float:right;">
              <a class="dropbtn" href="#">Help</a>
              <div class="dropdown-content">
                <a href="/home.html">Home</a>
                <a href="#">Link 2</a>
                <a href="#">Link 3</a>
              </div>
            </div>
          </li>
          <li class="line-top"><span>|</span></li>
          <li class="nav-item">
            <a class="nav-link active text-black" href="showInforUser.jsp">Join Us</a>
          </li>
          <li class="line-top"><span>|</span></li>
         <li class="nav-item">
                <a class="nav-link active text-white" href="#">Join Us</a>
            </li>
            <li class="nav-item">
                    <% User user = (User)request.getSession().getAttribute("user"); %>
                    <% if(user == null){ %>
                    <a class="nav-link active text-black" href="loginRegister.jsp?login=1">Sign In</a>
                    <% }else {%>
                    
                    
                    
                  <a class="nav-link active text-black" href="showInforUser.jsp"><%=user.getUser_name() %></a>
                    
                    
                    
                    
                    
                    <% }%>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <!-- NavBar head -->
  <!-- NavBar head 2 -->
  <div class="navbar-cus clearfix">
    <ul>
   		<a href="home.jsp"><i class="fa-brands fa-renren logo"></i></a>
   		<li>
       		<a class="nut_dropdown" id="nut_dropdown_all" href="HomeServerlet?type=none" onmouseover="OnmouseOver(id)" onmouseout="OnmouseOut(id)">All Products</a>
      	</li>
      	<li>
        	<a class="nut_dropdown" id="nut_dropdown_mans" href="HomeServerlet?type=1" onmouseover="OnmouseOver(id)" onmouseout="OnmouseOut(id)">Man</a>
      	</li>
      	<li>
        	<a class="nut_dropdown" id="nut_dropdown_womans" href="HomeServerlet?type=2" onmouseover="OnmouseOver(id)" onmouseout="OnmouseOut(id)">Woman</a>
      	</li>
      	<li>
        	<a class="nut_dropdown" id="nut_dropdown_kids" href="HomeServerlet?type=3" onmouseover="OnmouseOver(id)" onmouseout="OnmouseOut(id)">Kids</a>
      	</li>
        <li>
          <form class="search-container" action="HomeServerlet?search=search" method = "post">
            <input id="search-box" type="text" class="search-box" name="txtsearch" />
            <label for="search-box"><span class="search-icon"><i class="fa-solid fa-magnifying-glass"></i></span></label>
            <input type="submit" id="search-submit" />
          </form>
        </li>
        <a class="order" href="/orderDetail.html">
          <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-bag" viewBox="0 0 16 16">
            <path d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z"/>
          </svg>
        </a>
    </ul>


  </div>
  <div class="noi-dung" id="noi_dung" value="none">
    <ul>
      <li>
        <span onclick="ClickCategory(1)">Shoes</span>
        <!-- <a href="home.jsp?category=1" onclick="ClickCategory(href)">Shoes</a> -->
      </li>
      <li>
        <span onclick="ClickCategory(2)">Shirts</span>
        <!-- <a href="home.jsp?category=2" onclick="ClickCategory(href)">Shirts</a> -->
      </li>
      <li>
        <span onclick="ClickCategory(3)">Shorts</span>
        <!-- <a href="home.jsp?category=3" onclick="ClickCategory(href)">Shorts</a> -->
      </li>
      <li>
        <span onclick="ClickCategory(4)">Caps</span>
        <!-- <a href="home.jsp?category=4" onclick="ClickCategory(href)">Caps</a> -->
      </li>
    </ul>
    <script>
      function ClickCategory(category){
   		baseUrl = "HomeServerlet";
        type = document.getElementById("noi_dung").getAttribute('value');
        Url = baseUrl + "?category=" + category + "&type=" + type;
        window.location.href = Url;

      }
    </script>
    	 <%List<Item> items = (List<Item>)request.getSession().getAttribute("items"); %>
  </div>
    <!-- NavBar head 2 -->
    <!-- End Template -->
  <div class="body clearfix">
    <div class="boby-menu clearfix">
      <span> Products (<%= items.size() %>)</span>
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
        	<%
          
          	if(items != null){
          		for(int i=0; i<items.size();i++){
        	%>
        		<li class="product" value="<%=items.get(i).getItemId() %>" onclick="itemClick(value)">
		            <img alt="" class="attachment-shop_catalog"
		              src="<%=items.get(i).getImages()[0] %>" />
		            <span class="status">Just In</span>
		            <span class="name"><%= items.get(i).getItemName() %></span>
		            <span class="category"><%= items.get(i).getCategory() %></span>
		            <span class="colors"><%= items.get(i).getColor() %></span>
		            <span class="price"><%= items.get(i).getPrice() %>₫</span>
		            <span class="price-sale"><%=items.get(i).getDiscount_price() %>₫</span>
          		</li>
        	<% 
          		}
          	}
        	%>

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
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
    crossorigin="anonymous"></script>
  <script>
  function itemClick(id) {
      window.location.href = "ItemServerlet?id=" + id;
    }
    const searchtext = document.getElementById("text-search");
  </script>
  <script src="${pageContext.request.contextPath}/js/template.js"></script>
</body>
</body>
</html>