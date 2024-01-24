import sys
import requests
from dotenv import load_dotenv
import os
import unittest
#from wordnik.swagger import *
#from wordnik import WordApi, swagger

load_dotenv()
apikey = os.getenv("MWDict_API")
allcombos=0
correctcombos=0

def printresult(printtheword):
    return ''.join(printtheword)

def check_word_existence(word,api_key):

    api_url = f'https://www.dictionaryapi.com/api/v3/references/collegiate/json/{printresult(word)}?key={apikey}'
    global allcombos
    global correctcombos
    try:
        response = requests.get(api_url)
        if response.status_code == 200:
            confirm = response.json()
            #define = confirm[0].get('def', {}).get('{bc}', '')                   
            if confirm and isinstance(confirm, list) and 'meta' in confirm[0]:
                #metadata = confirm[0]['meta']
                print(f"{printresult(word)} is a word")
                correctcombos=correctcombos+1
                allcombos=allcombos+1
            else:
                allcombos=allcombos+1

                #print(printresult(word)+":IS A WORD")
                #print(confirm[0]['def'][0].get('{bc}', ''))
                #print(f"{i}. {definition['def'][0]}")
                #print(printresult(word)+":IS A WORD")
                #print("Definition: "+ define)

        else:
            print("Something went wrong")

    except Exception as e:
        print(f"Error: {e}")
        return False


def letsgotowork(theword,startindex,endindex):
    if startindex == endindex:
        check_word_existence(theword,'Not Needed Anymore')
    else:
        for iterator in range(startindex,endindex):
            theword[startindex],theword[iterator]=theword[iterator],theword[startindex]
            letsgotowork(theword,startindex+1,endindex)
            theword[iterator],theword[startindex]=theword[startindex],theword[iterator]

print(apikey)
print('The Anagram Program...HI!')
userinput = input("Please type in the word in question: ")
endindex = len(userinput)
theword = list(userinput)
letsgotowork(theword,0,endindex)
print(f"TOTAL LETTER COMBINATIONS: {allcombos}")   
print(f"ACTUAL WORDS FORMED: {correctcombos}")
