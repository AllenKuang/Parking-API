# Parking-API

## 1. method:POST  path:/parkingLots
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

## 2. method:POST path:/parkingBoys
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

## 3. method:POST path:/parkingBoys/{boyId}/parkingLots
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
