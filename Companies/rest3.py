import requests
def solve(lower, upper):
    resp=requests.get("https://jsonmock.hackerrank.com/api/medical_records").json()
    pages=resp['total_pages']
    ans=0
    for i in range(1,pages+1):
        resp2=requests.get(f"https://jsonmock.hackerrank.com/api/medical_records?page={i}").json()
        data=resp2['data']
        for medical in data:
            if medical['vitals']['bloodPressureDiastole']>=lower and medical['vitals']['bloodPressureDiastole']<=upper:
                ans+=1
    return ans
print(solve(120,160))