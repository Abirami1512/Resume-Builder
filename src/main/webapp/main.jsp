<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Design by foolishdeveloper.com -->
    <title>Main page</title>
 
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
    <!--Stylesheet-->
    <style media="screen">
      *,
*:before,
*:after{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}
body{
    background-color: #080710;
}
.background{
    width: 430px;
    height: 520px;
    position: absolute;
    transform: translate(-50%,-50%);
    left: 50%;
    top: 50%;
}


form{
    height: auto;
    margin-left: 20%;
    margin-right:20%;
    margin-top: 20px;
    width: 60%;
    background-color: rgba(255,255,255,0.13);
    position: absolute;
    border-radius: 10px;
    backdrop-filter: blur(10px);
    border: 2px solid rgba(255,255,255,0.1);
    box-shadow: 0 0 40px rgba(8,7,16,0.6);
    padding: 50px 35px;
}
form *{
    font-family: 'Poppins',sans-serif;
    color: #ffffff;
    letter-spacing: 0.5px;
    outline: none;
    border: none;
}
form h3{
    font-size: 32px;
    font-weight: 500;
    line-height: 42px;
    text-align: center;
}

label{
    display: block;
    margin-top: 30px;
    font-size: 16px;
    font-weight: 500;
}
input{
    display: block;
    height: 50px;
    width: 100%;
    background-color: rgba(255,255,255,0.07);
    border-radius: 3px;
    padding: 0 10px;
    margin-top: 8px;
    font-size: 14px;
    font-weight: 300;
}

textarea{
    display: block;
    height: 100px;
    width: 100%;
    background-color: rgba(255,255,255,0.07);
    border-radius: 3px;
    padding: 0 10px;
    margin-top: 8px;
    font-size: 14px;
    font-weight: 300;
}


::placeholder{
    color: #e5e5e5;
}

button{
    margin-top: 50px;
    width: 100%;
    background-color: #ffffff;
    color: #080710;
    padding: 15px 0;
    font-size: 18px;
    font-weight: 600;
    border-radius: 5px;
    cursor: pointer;
}
.social{
  margin-top: 30px;
  display: flex;
}
.social div{
  background: red;
  width: 150px;
  border-radius: 3px;
  padding: 5px 10px 10px 5px;
  background-color: rgba(255,255,255,0.27);
  color: #eaf0fb;
  text-align: center;
}
.social div:hover{
  background-color: rgba(255,255,255,0.47);
}
.social .fb{
  margin-left: 25px;
}
.social i{
  margin-right: 4px;
}

 </style>
</head>
<body>
<div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <form method="post" action ="GeneratePDF">
        <h3>Enter details</h3>
        <br>
        <label> Personal details</label><br>
        <input type="text" placeholder="Full name"  name="fullname"><br>
        <input type="text" placeholder="Qualification"  name="qualification"><br>
        <input type="text" placeholder="Mobile Number"  name="mobno"><br>
        <input type="text" placeholder="Email Id"  name="email"><br>
        <input type="text" placeholder="Linkedin / other media id"  name="media"><br>
        <br>
        <label>Summary</label><br>
        <textarea placeholder="Summary" name="summary"></textarea><br>
        <br>
        <label>Skills</label><br>
        <input type="text" placeholder="no 1"  name="skill1"><br>
        <input type="text" placeholder="no 2"  name="skill2"><br>
        <input type="text" placeholder="no 3"  name="skill3"><br>
        <input type="text" placeholder="no 4"  name="skill4"><br>
        <input type="text" placeholder="no 5"  name="skill5"><br>
        <br>
        <label>Achievements</label><br>
        <input type="text" placeholder="no 1"  name="ach1"><br>
        <input type="text" placeholder="description"  name="desc1"><br>
        <input type="text" placeholder="no 2"  name="ach2"><br>
        <input type="text" placeholder="description"  name="desc2"><br>
        <br>
        <label>Project / Internship 1</label><br>
        <input type="text" placeholder="Project name/ company name"  name="p1"><br>
        <input type="text" placeholder="Duration"  name="dur1"><br>
        <input type="text" placeholder="Description"  name="pdesc1"><br>
        <input type="text" placeholder="Technologies used"  name="tech1"><br>
        <br>
        <label>Project / Internship 2</label><br>
        <input type="text" placeholder="Project name/ company name"  name="p2"><br>
        <input type="text" placeholder="Duration"  name="dur2"><br>
        <input type="text" placeholder="Description"  name="pdesc2"><br>
        <input type="text" placeholder="Technologies used"  name="tech2"><br>
        <br>
        
        <label>Generate Resume</label><br>
        <input type = "submit" name="format" value="single column"><br>
        <input type = "submit" name="format" value="Double column"><br>
         
        <br>
    </form>
    <br><br>
</body>
</html>