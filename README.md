# Parking-API

## 1. Add a parkingLot  
## method:POST  path:/parkingLots 
``` 
Request:
ParkingLot parkingLot
{
  "parkingLotId":2
 }
Response:
ArrayList<ParkingLot>
[
  {"parkingLotId":2}
]
```

## 2.Add a parkingBoy 
## method:POST path:/parkingBoys
```
Request:
ParkingBoy pakingBoy
{
  "parkingBoyId":1
}
Response:
ArrayList<PrkingBoy>
[
    {
        "parkingBoyId": 1,
        "parkingLots": []
    },
    {
        "parkingBoyId": 1,
        "parkingLots": []
    }
]
```

## 3.Arrange a parkingLot for a parkingBoy by id
## method:POST path:/parkingBoys/{boyId}/parkingLots
```
Request:
ParkingLot parkingLot
{
  "parkingLotId":2
 }
 Response:
 ArrayList<ParkingBoy>
 [
    {
        "parkingBoyId": 1,
        "parkingLots": [
            {
                "parkingLotId": 1
            }
        ]
    }
]
