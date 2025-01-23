import requests
def total_goals(competition,year):
    resp=requests.get(f"https://jsonmock.hackerrank.com/api/football_competitions?name={competition}&year={year}").json()
    data1=resp['data']
    winner=data1[0]['winner']
    #there are two urls one contains winner as home team other has winner as visiting team 
    #get total pages from both respectively
    #traverse those pages and so the matches and add up the goals
    resp2=requests.get(f"https://jsonmock.hackerrank.com/api/football_matches?competition={competition}&year={year}&team1={winner}&page=1").json()
    pgs1=resp2['total_pages'] 
    
    resp22=requests.get(f"https://jsonmock.hackerrank.com/api/football_matches?competition={competition}&year={year}&team2={winner}&page=1").json()
    pgs2=resp22['total_pages']
    
    ans=0
    
    for i in range(1,pgs1+1): #if it won as a home team
        resp3=requests.get(f"https://jsonmock.hackerrank.com/api/football_matches?competition={competition}&year={year}&team1={winner}&page={i}").json()
        datahome=resp3['data']
        for match in datahome:#one match contains team1 team2 team1goals team2goals
            goals=match['team1goals']
            ans+=int(goals)
    
    for i in range(1,pgs2+1): #if it won as a visiting team
        resp3=requests.get(f"https://jsonmock.hackerrank.com/api/football_matches?competition={competition}&year={year}&team2={winner}&page={i}").json()
        datavis=resp3['data']
        for match in datavis:#one match contains team1 team2 team1goals team2goals
            goals=match['team2goals']
            ans+=int(goals)    
              
    return ans
print(total_goals("UEFA Champions League","2011"))     
      
    