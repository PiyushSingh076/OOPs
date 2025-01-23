import requests 
def solve(name,city):
    resp=requests.get("https://jsonmock.hackerrank.com/api/transactions?page=1").json()
    data=resp['data']
    pages=resp['total_pages']
    anscredit=0
    ansdebit=0
    
    for i in range(1,pages+1):
        resp=requests.get(f"https://jsonmock.hackerrank.com/api/transactions?page={i}").json()
        data=resp['data']
        for temp in data:
            if(temp['userName']==name and temp['location']['city']==city):
                if temp['txnType']=="credit":
                    a=float(temp["amount"].replace("$","").replace(",",""))
                    if a>anscredit:
                        anscredit=a
                else:
                    b=float(temp["amount"].replace("$","").replace(",",""))
                    if b>ansdebit:
                        ansdebit=b

    l=[]
    l.append("${:,.2f}".format(anscredit))
    l.append("${:,.2f}".format(ansdebit))
    

    return l    
ans= solve("Bob Martin","Bourg")
print(ans[0])
print(ans[1])