import sys
import requests
import os
import unittest
#import wordnik
from wordnik.swagger import *
from wordnik import WordApi, swagger

#sys.path = ['./'] + sys.path


def checkwordexistence(checkword):
    try:
        apiresult = wordApi.getWord(checkword)
    except:
        return

def printresult(printtheword):
    return ''.join(printtheword)

def letsgotowork(theword,startindex,endindex):
    if startindex == endindex:
        checkwordexistence(theword)
        if(checkwordexistence):
            #example = wordApi.getTopExample(theword)
            #print(example.text)
            print(printresult(theword))
        else:
            print("")
        #print(printresult(theword))
    else:
        for iterator in range(startindex,endindex):
            theword[startindex],theword[iterator]=theword[iterator],theword[startindex]
            letsgotowork(theword,startindex+1,endindex)
            theword[iterator],theword[startindex]=theword[startindex],theword[iterator]


print('The Anagram Program...HI!')
userinput = input("Please type in the word in question: ")
endindex = len(userinput)
theword = list(userinput)
apiUrl = 'https://api.wordnik.com/v4'
apiKey = 'cp0090ru6t5j215s6tblgaynpv7nse6iemxc44k057v3a5n6n'
connection = swagger.ApiClient(apiKey,apiUrl)
wordApi = WordApi.WordApi(connection)
letsgotowork(theword,0,endindex)

'''
apiUrl = 'https://api.wordnik.com/v4'
apiKey = 'cp0090ru6t5j215s6tblgaynpv7nse6iemxc44k057v3a5n6n'
connection = swagger.ApiClient(apiKey,apiUrl)
wordApi = WordApi.WordApi(connection)
example = wordApi.getTopExample('jdj')
print(example.text)
'''



'''How this should be done: I'm thinking about using an API to connect and see what words can 
be created with each distinctive char. 

A type of sorting algorhthim might be called for in this situation to rearrange the chars/letters and 
see what word can be outputted. 

The first version of this program will probably just be outputting the rearranged letters and 
making sure that every order is accounted for (from there apply it in a arraylist/vector as long as
the data structure is dynamic.)'''
