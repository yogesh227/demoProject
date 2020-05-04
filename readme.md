## Spring Boot JSON Demo close to what asked to do 

To run this import and start spring boot server ..
c
this project includes 
1) Get Call: localhost:8080/getjsons 

2) Post Call: localhost:8080/updatejsons 
	by Content-Type: application/json and below payload and can test other updation by changing input.json file unser resource folder.
	
	 {
	        "id": 1, //1 or whatever primary key of base json
	        "jsonPath": "/json/input.json"
	        
	  }
	  
3) Get Call: localhost:8080/comparejsons
for now its comparing input.json and Base.json and that to no need of input 

