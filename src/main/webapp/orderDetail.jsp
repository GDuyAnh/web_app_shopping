<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_template.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_orderDetail.css">
    <title>Order</title>
</head>
<body>
    <!-- Template -->
    <!-- NavBar head -->
    <nav class="navbar navbar-expand navbar-light py-lg-0" style="background-color: #f5f5f5; max-height: 33px;">
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
                        <a class="nav-link active text-black" href="/userDetail.html">Join Us</a>
                    </li>
                    <li class="line-top"><span>|</span></li>
                    <li class="nav-item">
                        <a class="nav-link active text-black" href="/loginRegister.html">Sign In</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- NavBar head -->
    <!-- NavBar head 2 -->
    <div class="navbar-cus clearfix">
        <ul>
            <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" fill="currentColor" class="bi bi-alipay logo"
                viewBox="0 0 16 16">
                <path
                    d="M2.541 0H13.5a2.551 2.551 0 0 1 2.54 2.563v8.297c-.006 0-.531-.046-2.978-.813-.412-.14-.916-.327-1.479-.536-.303-.113-.624-.232-.957-.353a12.98 12.98 0 0 0 1.325-3.373H8.822V4.649h3.831v-.634h-3.83V2.121H7.26c-.274 0-.274.273-.274.273v1.621H3.11v.634h3.875v1.136h-3.2v.634H9.99c-.227.789-.532 1.53-.894 2.202-2.013-.67-4.161-1.212-5.51-.878-.864.214-1.42.597-1.746.998-1.499 1.84-.424 4.633 2.741 4.633 1.872 0 3.675-1.053 5.072-2.787 2.08 1.008 6.37 2.738 6.387 2.745v.105A2.551 2.551 0 0 1 13.5 16H2.541A2.552 2.552 0 0 1 0 13.437V2.563A2.552 2.552 0 0 1 2.541 0Z" />
                <path
                    d="M2.309 9.27c-1.22 1.073-.49 3.034 1.978 3.034 1.434 0 2.868-.925 3.994-2.406-1.602-.789-2.959-1.353-4.425-1.207-.397.04-1.14.217-1.547.58Z" />
            </svg>
            <li>
                <a class="nut_dropdown" id="nut_dropdown_all" href="#" onmouseover="OnmouseOver(id)"
                    onmouseout="OnmouseOut(id)">All Products</a>
            </li>
            <li>
                <a class="nut_dropdown" id="nut_dropdown_mans" href="#" onmouseover="OnmouseOver(id)"
                    onmouseout="OnmouseOut(id)">Man</a>
            </li>
            <li>
                <a class="nut_dropdown" id="nut_dropdown_womans" href="#" onmouseover="OnmouseOver(id)"
                    onmouseout="OnmouseOut(id)">Woman</a>
            </li>
            <li>
                <a class="nut_dropdown" id="nut_dropdown_kids" href="#" onmouseover="OnmouseOver(id)"
                    onmouseout="OnmouseOut(id)">Kids</a>
            </li>
            <li>
                <form class="search-container" action="ManagerServlet?search=search" method="post">
                    <input id="search-box" type="text" class="search-box" name="txtsearch" />
                    <label for="search-box"><span class="search-icon"><i
                                class="fa-solid fa-magnifying-glass"></i></span></label>
                    <input type="submit" id="search-submit" />
                </form>
            </li>
            <a class="order clearfix" href="/orderDetail.html">
                <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-bag"
                    viewBox="0 0 16 16">
                    <path
                        d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z" />
                </svg>
                <span class="order_total clearfix">4</span>
            </a>
        </ul>


    </div>
    <div class="noi-dung" id="noi_dung" value="none">
        <ul>
            <li>
                <a href="/itemsShow.html">Shoes</a>
            </li>
            <li>
                Shirts
            </li>
            <li>
                Shorts
            </li>
            <li>
                Caps
            </li>
        </ul>
    </div>
    <!-- NavBar head 2 -->
    <!-- End Template -->
    <div style="height: 50px;">
    </div>
    <div class="container_main clearfix">
        <div class="container_left clearfix">
            <div class="order_bag">
                <span class="sub_title">Bag</span>
                <div class="list_orders">
                    <div class="order_item">
                        <div class="item item_img">
                            <img src="https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/572475a8-427c-43a6-9fa9-5d41827fc848/air-force-1-07-shoes-hr5tH4.png"
                                alt="">
                        </div>
                        <div class="item item_infor">
                            <span class="infor item_name">Nike Air Force 1 '07</span>
                            <span class="infor item_category">Men's Shoes</span>
                            <span class="infor item_color">White/Red</span>
                            <div class="infor item_choose">
                                <span class="item_size">Size 44</span>
                                <span class="item_quantity">Quantity 2</span>
                            </div>
                            <div class="infor sub_options">
                                <button><i class="fa-regular fa-heart"></i></button>
                                <button><i class="fa-regular fa-trash-can"></i></button>
                            </div>
                        </div>
                        <div class="item item_price">
                            7,038,000₫
                        </div>
                    </div>
                    <div class="order_item">
                        <div class="item item_img">
                            <img src="https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/ee25f07e-c45a-4fa9-a0f1-0d29e286fab0/air-force-1-mid-07-shoes-ZzCgrn.png"
                                alt="">
                        </div>
                        <div class="item item_infor">
                            <span class="infor item_name">Nike Air Force 1 Mid '07</span>
                            <span class="infor item_category">Men's Shoes</span>
                            <span class="infor item_color">White/White/Wolf Grey</span>
                            <div class="infor item_choose">
                                <span class="item_size">Size 40.5</span>
                                <span class="item_quantity">Quantity 1</span>
                            </div>
                            <div class="infor sub_options">
                                <button><i class="fa-regular fa-heart"></i></button>
                                <button><i class="fa-regular fa-trash-can"></i></button>
                            </div>
                        </div>
                        <div class="item item_price">
                            3,519,000₫
                        </div>
                    </div>
                    <div class="order_item">
                        <div class="item item_img">
                            <img src="https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/02e1a28f-6f5c-462e-af45-bd9ec18f3fb9/air-force-1-07-lv8-shoes-Blj3sx.png"
                                alt="">
                        </div>
                        <div class="item item_infor">
                            <span class="infor item_name">Nike Air Force 1 '07 LV8</span>
                            <span class="infor item_category">Men's Shoes</span>
                            <span class="infor item_color">White/Stadium</span>
                            <div class="infor item_choose">
                                <span class="item_size">Size 44</span>
                                <span class="item_quantity">Quantity 1</span>
                            </div>
                            <div class="infor sub_options">
                                <button><i class="fa-regular fa-heart"></i></button>
                                <button><i class="fa-regular fa-trash-can"></i></button>
                            </div>
                        </div>
                        <div class="item item_price">
                            3,519,000₫
                        </div>
                    </div>
                    <div class="order_item">
                        <div class="item item_img">
                            <img src="https://zunezx.com/upload/image/cache/data/banner/Tee/UP-WEB/central-shirt/3-a22-crop-550-550.PNG" alt="">
                            <!-- <img src="https://zunezx.com/upload/image/cache/data/banner/Tee/UP-WEB/central-shirt/IMG7398-b1e-crop-550-550.jpg" alt=""> -->
                        </div>
                        <div class="item item_infor">
                            <span class="infor item_name">Central Coast Lady Shirt</span>
                            <span class="infor item_category">Unisex Clothing</span>
                            <span class="infor item_color">Black</span>
                            <div class="infor item_choose">
                                <span class="item_size">Size XL</span>
                                <span class="item_quantity">Quantity 1</span>
                            </div>
                            <div class="infor sub_options">
                                <button><i class="fa-regular fa-heart"></i></button>
                                <button><i class="fa-regular fa-trash-can"></i></button>
                            </div>
                        </div>
                        <div class="item item_price">
                            590,000₫
                        </div>
                    </div>
                </div>
            </div>
            <div class="favourites_item">
                <span class="sub_title">Favourite</span>
                <div>
                    <span class="description">There are no items saved to your favourites.</span>
                </div>

            </div>
        </div>
        <div class="container_right clearfix">
            <span class="sub_title">Summary</span>
            <div class="summary_total">
                <div class="subtotal_pay clearfix">
                    <div class="infor_label clearfix">Subtotal</div>
                    <div class="value_label clearfix">14,666,000₫</div>
                </div>
                <div class="deliver_pay clearfix">
                    <div class="infor_label">Estimated Delivery & Handling</div>
                    <div class="value_label">54,000₫</div>
                </div>
                <div class="total_payment clearfix">
                    <div class="infor_label">Total</div>
                    <div class="value_label">14,720,000₫</div>
                </div>
                <form action="#" method="post">
                    <button class="checkout_btn" type="submit">Checkout<i class="fa-solid fa-wallet"></i></button>
                </form>
            </div>
        </div>

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

    <script src="template.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>