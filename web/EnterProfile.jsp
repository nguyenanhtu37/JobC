<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

    <head>
        <title>JobC &mdash; View Profile Page</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


        <link rel="stylesheet" href="css/custom-bs.css">
        <link rel="stylesheet" href="css/jquery.fancybox.min.css">
        <link rel="stylesheet" href="css/bootstrap-select.min.css">
        <link rel="stylesheet" href="fonts/icomoon/style.css">
        <link rel="stylesheet" href="fonts/line-icons/style.css">
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/animate.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
              integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/brands.min.css"
              integrity="sha512-G/T7HQJXSeNV7mKMXeJKlYNJ0jrs8RsWzYG7rVACye+qrcUhEAYKYzaa+VFy6eFzM2+/JT1Q+eqBbZFSHmJQew=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/fontawesome.min.css"
              integrity="sha512-giQeaPns4lQTBMRpOOHsYnGw1tGVzbAIHUyHRgn7+6FmiEgGGjaG0T2LZJmAPMzRCl+Cug0ItQ2xDZpTmEc+CQ=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/regular.min.css"
              integrity="sha512-k2UAKyvfA7Xd/6FrOv5SG4Qr9h4p2oaeshXF99WO3zIpCsgTJ3YZELDK0gHdlJE5ls+Mbd5HL50b458z3meB/Q=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/solid.min.css"
              integrity="sha512-6mc0R607di/biCutMUtU9K7NtNewiGQzrvWX4bWTeqmljZdJrwYvKJtnhgR+Ryvj+NRJ8+NnnCM/biGqMe/iRA=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/svg-with-js.min.css"
              integrity="sha512-iyaXtrpKz7FIRsICgrvVtq1vkSJT/cfLeXA0sHSQaAs0y3LdqXWlQCXTxM246mTQ/M2qpyVX3A0aRfmTt0LOCQ=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/v4-font-face.min.css"
              integrity="sha512-ueEJBIkl0DBM2fA8eS/o12U3l+ZUFn32IUY4jIaTZnNtKR4ktQw3cE/tx/tFIYJuBm4EVT7WUMqIXP1TUN0boA=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/v4-shims.min.css"
              integrity="sha512-SkKgNHAdwXn0lw1CzCwHFpNidxo0GT4AEueTmvgUoBRnxwfFDmWUsRfS6ZjxhXP8HystwoBp8fYDfuWD6azryQ=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/v5-font-face.min.css"
              integrity="sha512-5V4m5oBRPLC2aZloM2/C/Simvm/jRfHXcqxTC6iW3FS93jfEWEFmJ7dWqAHME6CGlAG4StQ3f7kN41EUjEFJUQ=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />


        <!-- MAIN CSS -->
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body id="top">

        <div id="overlayer"></div>
        <div class="loader">
            <div class="spinner-border text-primary" role="status">
                <span class="sr-only">Loading...</span>
            </div>
        </div>


        <div class="site-wrap">

            <div class="site-mobile-menu site-navbar-target">
                <div class="site-mobile-menu-header">
                    <div class="site-mobile-menu-close mt-3">
                        <span class="icon-close2 js-menu-toggle"></span>
                    </div>
                </div>
                <div class="site-mobile-menu-body"></div>
            </div> <!-- .site-mobile-menu -->


            <!-- NAVBAR -->
            <header class="site-navbar mt-3">
                <div class="container-fluid">
                    <div class="row align-items-center">
                        <div class="site-logo col-6"><a href="mainEnter.jsp">JobC</a></div>

                        <nav class="mx-auto site-navigation">
                            <ul class="site-menu js-clone-nav d-none d-xl-block ml-0 pl-0">
                                <li><a href="mainEnter.jsp" class="nav-link active">Home</a></li>
                                <li><a href="PostJob.jsp">Post Job</a></li>
                                <li><a href="about.html">Interview</a></li>
                                <li><a href="about.html">Posted Job</a></li>
                            </ul>
                        </nav>

                        <div class="ml-auto">
                            <a href="post-job.html"
                               class="btn btn-outline-white border-width-2 d-none d-lg-inline-block mx-2"><span
                                    class="mr-2 icon-add"></span>Post a Job</a>
                            <div class="dropdown d-none d-lg-inline-block">

                                <div class=" mx-2" style="color: white; font-size: 20px;" type="button" id="signUp"
                                     data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="fa-regular fa-user"></i>
                                    <span class="icon-text mx-2 text-capitalize">Enterprise</span>
                                </div>
                                <!-- <button class="btn btn-primary border-width-2  dropdown-toggle" >
                                Account
                              </button> -->
                                <div class="dropdown-menu mt-2" aria-labelledby="dropdownMenuButton">
                                    <a class="dropdown-item" href="EditProfile.jsp">Edit a profile</a>
                                    <a class="dropdown-item" href="index.jsp">Log out</a>
                                </div>

                            </div>

                        </div>
                    </div>
            </header>

            <!-- HOME -->
            <section class="section-hero overlay inner-page bg-image" style="background-image: url('images/hero_1.jpg');"
                     id="home-section">
                <div class="container">
                    <div class="row">
                        <div class="col-md-7">
                            <h1 class="text-white font-weight-bold">Enterprise Profile</h1>
                            <div class="custom-breadcrumbs">
                                <a href="#">Home</a> <span class="mx-2 slash">/</span>
                                <span class="text-white"><strong>Enterprise Profile</strong></span>
                            </div>
                        </div>
                    </div>
                </div>
            </section>


            <section class="site-section">
                <div class="container">

                    <div class="row align-items-center mb-5">
                        <div class="col-lg-10 mb-4 mb-lg-0">
                            <div class="d-flex align-items-center text-capitalize">
                                <div>
                                    <h2>Enterprise Profile</h2>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row mb-5">
                        <div class="col-lg-12">
                            <form action="PostJobServlet" class="p-4 p-md-5 border rounded" method="post">
                                <h3 class="text-black mb-5 border-bottom pb-2 text-capitalize">Profile</h3>
                                <div class="form-group">
                                    <label for="name" class="text-capitalize">Name</label>
                                    <input type="text" class="form-control" id="name" placeholder="Enter your name"
                                           value="Enterprise Name" readonly>
                                </div>
                                <div class="form-group">
                                    <label for="phone" class="text-capitalize">Phone</label>
                                    <input type="text" class="form-control" id="phone" placeholder="Enter your phone"
                                           value="0123456789" readonly>
                                </div>
                                <div class="form-group">
                                    <label for="place" class="text-capitalize">Address</label>
                                    <input type="text" class="form-control" id="place" placeholder="Enter your address"
                                           value="Enterprise Address" readonly>
                                </div>
                                <div class="form-group">
                                    <label for="description">Description</label>
                                    <textarea rows="4" readonly name="job_description"
                                              class="form-control">dcm simp vcl</textarea>
                                    <!-- <div class="editor" id="editor-1" name="job_description" readonly> -->
                                    <!-- </div> -->
                                </div>
                                <div class="form-group">
                                    <label for="job-title" class="text-capitalize">Taxcode</label>
                                    <input type="number" class="form-control" id="taxcode" placeholder="Enter your taxcode"
                                           value="0303543710" readonly>
                                </div>
                                <div class="row mb-5 justify-content-end">
                                    <div class="col-lg-3 col-md-3">
                                        <a href="EditProfile.jsp" class="btn btn-block btn-primary btn-md text-white">Edit
                                            the
                                            profile</a>
                                    </div>
                                    <div class="col-lg-3 col-md-3">
                                        <a type="submit" class="btn btn-block btn-secondary btn-md text-white" href="ChangePassword.jsp">Change
                                            password</a>
                                    </div>
                                </div>
                            </form>
                        </div>


                    </div>

                </div>
            </section>



            <footer class="site-footer">

                <a href="#top" class="smoothscroll scroll-top">
                    <span class="icon-keyboard_arrow_up"></span>
                </a>

                <div class="container">
                    <div class="row mb-5">
                        <div class="col-6 col-md-3 mb-4 mb-md-0">
                            <h3>Search Trending</h3>
                            <ul class="list-unstyled">
                                <li><a href="#">Web Design</a></li>
                                <li><a href="#">Graphic Design</a></li>
                                <li><a href="#">Web Developers</a></li>
                                <li><a href="#">Python</a></li>
                                <li><a href="#">HTML5</a></li>
                                <li><a href="#">CSS3</a></li>
                            </ul>
                        </div>
                        <div class="col-6 col-md-3 mb-4 mb-md-0">
                            <h3>Company</h3>
                            <ul class="list-unstyled">
                                <li><a href="#">About Us</a></li>
                                <li><a href="#">Career</a></li>
                                <li><a href="#">Blog</a></li>
                                <li><a href="#">Resources</a></li>
                            </ul>
                        </div>
                        <div class="col-6 col-md-3 mb-4 mb-md-0">
                            <h3>Support</h3>
                            <ul class="list-unstyled">
                                <li><a href="#">Support</a></li>
                                <li><a href="#">Privacy</a></li>
                                <li><a href="#">Terms of Service</a></li>
                            </ul>
                        </div>
                        <div class="col-6 col-md-3 mb-4 mb-md-0">
                            <h3>Contact Us</h3>
                            <div class="footer-social">
                                <a href="#"><span class="icon-facebook"></span></a>
                                <a href="#"><span class="icon-twitter"></span></a>
                                <a href="#"><span class="icon-instagram"></span></a>
                                <a href="#"><span class="icon-linkedin"></span></a>
                            </div>
                        </div>
                    </div>

                    <div class="row text-center">
                        <div class="col-12">
                            <p class="copyright"><small>
                                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                    Copyright &copy;
                                    <script>document.write(new Date().getFullYear());</script> All rights reserved | This
                                    template is made
                                    with <i class="icon-heart text-danger" aria-hidden="true"></i> by <a
                                        href="https://colorlib.com" target="_blank">Colorlib</a>
                                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                </small></p>
                        </div>
                    </div>
                </div>
            </footer>

        </div>

        <!-- SCRIPTS -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="js/isotope.pkgd.min.js"></script>
        <script src="js/stickyfill.min.js"></script>
        <script src="js/jquery.fancybox.min.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>

        <script src="js/jquery.waypoints.min.js"></script>
        <script src="js/jquery.animateNumber.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/quill.min.js"></script>


        <script src="js/bootstrap-select.min.js"></script>

        <script src="js/custom.js"></script>



    </body>

</html>
