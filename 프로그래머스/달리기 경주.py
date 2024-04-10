def solution(players, callings):
    name = dict()
    
    for i, p in enumerate(players):
        name[p] = i
    
    for calling in callings:
        callingRank = name[calling]
        afterName = players[callingRank-1]
        name[calling]-=1
        name[afterName]+=1
        players[callingRank], players[callingRank-1] = players[callingRank-1], players[callingRank]
    
    return players