# fyle-backend-api

<strong>API Base URL: https://fylepostgres.herokuapp.com/ <br/> Health Check: https://fylepostgres.herokuapp.com/actuator/health</strong>


<strong>1. Given a bank branch IFSC code, get branch details</strong>

Method: GET

API URL: /bank/{ifsc}

Example: /bank/ABHY0065002

Response Body:
{
    "data": {
        "ifsc": "ABHY0065002",
        "bank_id": 60,
        "branch": "ABHYUDAYA NAGAR",
        "address": "ABHYUDAYA EDUCATION SOCIETY, OPP. BLDG. NO. 18, ABHYUDAYA NAGAR, KALACHOWKY, MUMBAI - 400033",
        "city": "MUMBAI",
        "state": "MAHARASHTRA"
    },
    "success": true,
    "status": 3000,
    "message": "Records Fetched"
}


<strong>2. Given a bank name and city, gets details of all branches of the bank in the city</strong>

Method: POST

API URL: bank/list

RequestBody: 
{
	"bank" : "STATE BANK OF INDIA",
	"city" : "Mumbai",
	"offset" : 0,
	"limit" : 2
}

Response Body:
{
    "data": [
        {
            "ifsc": "SBIN0000290",
            "bank_id": 1,
            "branch": "WORLI NORTH",
            "address": "NIRLON HOUSE,DR ANNIE BESANT RD,WORLI,MUMBAI",
            "city": "MUMBAI",
            "state": "MAHARASHTRA"
        },
        {
            "ifsc": "SBIN0000300",
            "bank_id": 1,
            "branch": "MUMBAI MAIN",
            "address": "MUMBAI",
            "city": "MUMBAI",
            "state": "MAHARASHTRA"
        }
    ],
    "success": true,
    "status": 3000,
    "message": "Records Fetched"
}
