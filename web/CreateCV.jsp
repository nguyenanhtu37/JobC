
<!doctype html>
<html lang="en">
  <head>
    <title>JobC &mdash; Post CV</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href='https://fonts.googleapis.com/css?family=Roboto:400,500,400italic,300italic,300,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <script defer src="https://use.fontawesome.com/releases/v5.1.0/js/all.js" integrity="sha384-3LK/3kTpDE/Pkp8gTNp2gR/2gOiwQ6QaO7Td0zV76UFJVhqLl4Vl3KL1We6q6wR9" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>   
    <!-- Theme CSS -->  
    <link id="theme-style" rel="stylesheet" href="assets/css/orbit-1.css">
    <link rel="stylesheet" href="css/custom-bs.css">
    <link rel="stylesheet" href="css/jquery.fancybox.min.css">
    <link rel="stylesheet" href="css/bootstrap-select.min.css">
    <link rel="stylesheet" href="fonts/icomoon/style.css">
    <link rel="stylesheet" href="fonts/line-icons/style.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/animate.min.css">
    <link rel="stylesheet" href="css/quill.snow.css">
    <link rel="stylesheet" href="css/writeCV.css"/>
    

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
            <div class="site-logo col-6"><a href="mainUser.jsp">JobC</a></div>

          <nav class="mx-auto site-navigation">
            <ul class="site-menu js-clone-nav d-none d-xl-block ml-0 pl-0">
                <li>
                    <a href="mainUser.jsp" class="nav-link">Home</a>
                </li>
                <a href="#" class="active">Write CV</a>
                <li>
                    <a href="mainUser.jsp" class="nav-link">View CV</a>
                </li>
            </ul>
          </nav>
          
          <div class="right-cta-menu text-right d-flex aligin-items-center col-6">
            <div class="ml-auto">
            <a href="#" class="site-menu-toggle js-menu-toggle d-inline-block d-xl-none mt-lg-2 ml-3"><span class="icon-menu h3 m-0 p-0 mt-2"></span></a>
          </div>

        </div>
      </div>
    </header>

    <!-- HOME -->
    <section class="section-hero overlay inner-page bg-image" style="background-image: url('images/hero_1.jpg');" id="home-section">
      <div class="container">
        <div class="row">
          <div class="col-md-7">
            <h1 class="text-white font-weight-bold">Write CV</h1>
            <div class="custom-breadcrumbs">
                <a href="mainUser.jsp">Home</a> <span class="mx-2 slash">/</span>
              <span class="text-white"><strong>View CV</strong></span>
            </div>
          </div>
        </div>
      </div>
    </section>

    
    <section class="site-section">
      <div class="container">

        <div class="row align-items-center mb-5">
          <div class="col-lg-8 mb-4 mb-lg-0">
            <div class="d-flex align-items-center">
              <div>
                <h2>Write CV</h2>
              </div>
            </div>
          </div>
        </div>
        <body>
    <div class="wrapper">
        <div class="sidebar-wrapper">
            <div class="profile-container">
                <img class="profile" src="assets/images/profile.png" alt="" />
                <h1 style="display: flex; justify-content: center; align-items: center;">
                <input class="text-center"
                style="width: 200px;"
                name="name"
                id="name"
                value=""
                placeholder="AnhTus"
                />
                </h1>
                <h5 style="display: flex; justify-content: center; align-items: center;">
                    <input class="text-center"
                style="width: 180px;"
                name="ba"
                id="ba"
                value=""
                placeholder="Business Analysis"
                />
                </h5>
                
                </div><!--//profile-container-->

            
            <div class="contact-container container-block">
                <ul class="list-unstyled contact-list">
                    <li class="email"><i class="fas fa-envelope"></i><input name="email" id="email" value="" type="text" placeholder="gmail@gmail.com"></li>
                    <li class="linkedin"><i class="fab fa-linkedin-in"></i><input name="linkin" id="linkin" value="" type="text" placeholder="linkin.com"></li>
                    <li class="github"><i class="fab fa-github"></i><input name="githubs" id="githubs" value="" type="text" placeholder="githubs.com/natri37"></li>
                    <li class="twitter"><i class="fab fa-twitter"></i><input name="twitter" id="twitter" value="" type="text" placeholder="twitter.com"></li>
                </ul>
            </div><!--//contact-container-->
            <div class="education-container container-block">
                <h2 class="container-block-title">Education</h2>
                <div class="item">
                        <h5><input style="width: 200px" name="major1" id="major1" value="" type="text" placeholder="Software Engineering"></h5>
                        <h6><input style="width: 200px" name="place1" id="place1" value="" type="text" placeholder="FPT University"></h6>
                <div class="time"><input style="width: 200px" name="time1" id="time1" value="" type="text" placeholder="2021-2025"></div>
                </div><!--//item-->
                <div class="item">
                        <h5><input style="width: 200px" name="major2" id="major2" value="" type="text" placeholder="Artificial Intelligence"></h5>
                        <h6><input style="width: 200px" name="place2" id="place2" value="" type="text" placeholder="FPT University"></h6>
                <div class="time"><input style="width: 200px" name="time2" id="time2" value="" type="text" placeholder="2021-2025"></div>
                </div><!--//item-->
            </div><!--//education-container-->
            
            <div class="languages-container container-block">
                <h2 class="container-block-title">Languages</h2>
                <ul class="list-unstyled interests-list">
                    <li><input style="width: 200px" name="language1" id="language1" value="" type="text" placeholder="English"><span class="lang-desc"></span></li>
                    <li><input style="width: 200px" name="language2" id="language2" value="" type="text" placeholder="Japanese"><span class="lang-desc"></span></li>
                    <li><input style="width: 200px" name="language3" id="language3" value="" type="text" placeholder="Chinese"><span class="lang-desc"></span></li>
                    <li><input style="width: 200px" name="language4" id="language4" value="" type="text" placeholder="Korean"><span class="lang-desc"></span></li>
                </ul>
            </div><!--//interests-->
            
            <div class="interests-container container-block">
                <h2 class="container-block-title">Interests</h2>
                <ul class="list-unstyled interests-list">
                    <li><input style="width: 200px" name="interest1" id="interest1" value="" type="text" placeholder="Climbing"></li>
                    <li><input style="width: 200px" name="interest2" id="interest2" value="" type="text" placeholder="Playing guitar"></li>
                    <li><input style="width: 200px" name="interest3" id="interest3" value="" type="text" placeholder="Singing"></li>
                    <li><input style="width: 200px" name="interest4" id="interest4" value="" type="text" placeholder="Cooking"></li>
                    <li><input style="width: 200px" name="interest5" id="interest5" value="" type="text" placeholder="Sleeping"></li>
                </ul>
            </div><!--//interests-->
            
        </div><!--//sidebar-wrapper-->
        
        <div class="main-wrapper">
            
            <section class="section summary-section">
                <h2 class="section-title"><span class="icon-holder"><i class="fas fa-user"></i></span>Career Profile</h2>
                <div class="summary">
<p>
  <textarea
    style="width: 600px; height: 300px; white-space: pre-wrap;"
    name="careerprofile"
    id="careerprofile"
    placeholder="Experienced IT professional with a strong background in software development. Proven success in roles such as Lead Developer and Senior Software Engineer, collaborating with industry leaders like Google and Amazon. Expertise in Python, Django, Javascript, and jQuery. Committed to staying ahead of tech trends for delivering high-quality solutions. Effective communicator and team leader, passionate about driving IT innovation."
  ></textarea>
</p>
                </div><!--//summary-->
            </section><!--//section-->
            
            <section class="section experiences-section">
                <h2 class="section-title"><span class="icon-holder"><i class="fas fa-briefcase"></i></span>Experiences</h2>
                
                <div class="item">
                    <div class="meta">
                        <div class="upper-row">
                            <h3 class="job-title"><input name="ex1" id="ex1" value="" type="text" placeholder="Experience 1"></h3>
                            <div class="time"><input class="text-right" type="text" name="year1" id="year1" value="" placeholder="20xx - 20yy"></div>
                        </div><!--//upper-row-->
                        <div class="company"><input type="text" name="position1" id="position1" value="" placeholder="Da Nang"></div>
                    </div><!--//meta-->
                    <div class="details">
                        <p><textarea
    style="width: 600px; height: 300px; white-space: pre-wrap;"
    name="exd1"
    id="exd1"
    placeholder="Your requested text seems to be a placeholder commonly used in the design and typesetting industry. It doesn't have a specific meaning as it is a scrambled version of Latin-like words. If you have specific content or a role description you'd like to be translated, please provide the actual text, and I'll be happy to help."
  ></textarea></p>  
                        </div><!--//details-->
                </div><!--//item-->
                
                <div class="item">
                    <div class="meta">
                        <div class="upper-row">
                            <h3 class="job-title"><input name="ex2" id="ex1" value="" type="text" placeholder="Experience 2"></h3>
                            <div class="time"><input class="text-right" type="text" name="year2" id="year1" value="" placeholder="20xx - 20yy"></div>
                        </div><!--//upper-row-->
                        <div class="company"><input type="text" name="position2" id="position1" value="" placeholder="Da Nang"></div>
                    </div><!--//meta-->
                    <div class="details">
                        <p><textarea
    style="width: 600px; height: 300px; white-space: pre-wrap;"
    name="exd2"
    id="exd1"
    placeholder="Your requested text seems to be a placeholder commonly used in the design and typesetting industry. It doesn't have a specific meaning as it is a scrambled version of Latin-like words. If you have specific content or a role description you'd like to be translated, please provide the actual text, and I'll be happy to help."
  ></textarea></p>  
                        </div><!--//details-->
                </div><!--//item-->
                
                <div class="item">
                    <div class="meta">
                        <div class="upper-row">
                            <h3 class="job-title"><input name="ex3" id="ex1" value="" type="text" placeholder="Experience 3"></h3>
                            <div class="time"><input class="text-right" type="text" name="year3" id="year1" value="" placeholder="20xx - 20yy"></div>
                        </div><!--//upper-row-->
                        <div class="company"><input type="text" name="position3" id="position1" value="" placeholder="Da Nang"></div>
                    </div><!--//meta-->
                    <div class="details">
                        <p><textarea
    style="width: 600px; height: 300px; white-space: pre-wrap;"
    name="exd3"
    id="exd1"
    placeholder="Your requested text seems to be a placeholder commonly used in the design and typesetting industry. It doesn't have a specific meaning as it is a scrambled version of Latin-like words. If you have specific content or a role description you'd like to be translated, please provide the actual text, and I'll be happy to help."
  ></textarea></p>  
                        </div><!--//details-->
                </div><!--//item-->
                
            </section><!--//section-->
            
            <section class="section projects-section">
                <h2 class="section-title"><span class="icon-holder"><i class="fas fa-archive"></i></span>Projects</h2>
                <div class="item">
                    <span class="project-title"><input type="text" name="prj1" id="prj" value="" placeholder="Project A"></span> <br>
                    <span class="project-tagline">
                        <textarea
                        style="width: 600px; height: 300px; white-space: pre-wrap;"
                        name="content1"
                        id="content"
                        placeholder="A responsive website template designed to help startups promote, market and sell their products."></textarea>
                    </span>
                    
                </div><!--//item-->
                <div class="item">
                    <span class="project-title"><input type="text" name="prj2" id="prj" value="" placeholder="Project B"></span> <br>
                    <span class="project-tagline">
                        <textarea
                        style="width: 600px; height: 300px; white-space: pre-wrap;"
                        name="content2"
                        id="content"
                        placeholder="A responsive website template designed to help startups promote, market and sell their products."></textarea>
                    </span>
                    
                </div><!--//item-->
                <div class="item">
                    <span class="project-title"><input type="text" name="prj3" id="prj" value="" placeholder="Project C"></span> <br>
                    <span class="project-tagline">
                        <textarea
                        style="width: 600px; height: 300px; white-space: pre-wrap;"
                        name="content3"
                        id="content"
                        placeholder="A responsive website template designed to help startups promote, market and sell their products."></textarea>
                    </span>
                    
                </div><!--//item-->
            
            <section class="skills-section section">
                <h2 class="section-title"><span class="icon-holder"><i class="fas fa-rocket"></i></span>Skills & Proficiency</h2>
                <div class="skillset"> 


                    
                    <div class="item">
                        <h3 class="level-title">Python & Django</h3>
                        <div class="progress level-bar">
						    <div class="progress-bar theme-progress-bar" role="progressbar" style="width: 99%" aria-valuenow="99" aria-valuemin="0" aria-valuemax="100"></div>
						</div>                               
                    </div>
                    
                    <div class="item">
                        <h3 class="level-title">Javascript & jQuery</h3>
                        <div class="progress level-bar">
						    <div class="progress-bar theme-progress-bar" role="progressbar" style="width: 98%" aria-valuenow="98" aria-valuemin="0" aria-valuemax="100"></div>
						</div>                              
                    </div><!--//item-->
                    
                    <div class="item">
                        <h3 class="level-title">Angular</h3>
                        <div class="progress level-bar">
						    <div class="progress-bar theme-progress-bar" role="progressbar" style="width: 98%" aria-valuenow="98" aria-valuemin="0" aria-valuemax="100"></div>
						</div>                                 
                    </div><!--//item-->
                    
                    <div class="item">
                        <h3 class="level-title">HTML5 & CSS</h3>
                        <div class="progress level-bar">
							    <div class="progress-bar theme-progress-bar" role="progressbar" style="width: 95%" aria-valuenow="95" aria-valuemin="0" aria-valuemax="100"></div>
						</div>                                
                    </div><!--//item-->
                    
                    <div class="item">
                        <h3 class="level-title">Ruby on Rails</h3>
                        <div class="progress level-bar">
						    <div class="progress-bar theme-progress-bar" role="progressbar" style="width: 85%" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100"></div>
						</div>                                  
                    </div><!--//item-->
                    
                    <div class="item">
                        <h3 class="level-title">Sketch & Photoshop</h3>
                        <div class="progress level-bar">
						    <div class="progress-bar theme-progress-bar" role="progressbar" style="width: 60%" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"></div>
						</div>                                 
                    </div><!--//item-->
                    
                </div>  
            </section><!--//skills-section-->
            
        </div><!--//main-body-->
    </div>
        <div class="row align-items-center mb-5">
          
          <div class="col-lg-4 ml-auto">
            <div class="row">
              <div class="col-8">
    <br>
    <a href="javascript:void(0);" onclick="downloadAsImage();" class="btn btn-block btn-primary btn-md">Download as Image</a>
</div>

            </div>
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
            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart text-danger" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank" >Colorlib</a>
            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></small></p>
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
   
   
     <script src="https://html2canvas.hertzen.com/dist/html2canvas.min.js"></script>
     <script>
    function downloadAsImage() {
        // Ch?n ph?n c?n chuy?n ??i thành ?nh
        var element = document.querySelector('.wrapper');

        // S? d?ng html2canvas ?? chuy?n ??i thành hình ?nh
        html2canvas(element).then(function (canvas) {
            // T?o m?t URL t? hình ?nh
            var imgData = canvas.toDataURL('image/png');

            // T?o m?t th? <a> ?? kh?i t?o t?i v?
            var link = document.createElement('a');
            link.href = imgData;
            link.download = 'template_image.png';

            // Thêm th? <a> vào trang và kích ho?t s? ki?n nh?p chu?t
            document.body.appendChild(link);
            link.click();

            // Xóa th? <a> sau khi t?i v?
            document.body.removeChild(link);
        });
    }
</script>
  </body>
</html>