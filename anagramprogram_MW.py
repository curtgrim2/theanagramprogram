#https://www.dictionaryapi.com/api/v3/references/collegiate/json/dad?key=f25abb33-a3be-4049-8767-f3b871339adc
import sys
import requests
import os
import unittest
#from wordnik.swagger import *
#from wordnik import WordApi, swagger

def printresult(printtheword):
    return ''.join(printtheword)

def check_word_existence(word,api_key='f25abb33-a3be-4049-8767-f3b871339adc'):
    api_url = f'https://www.dictionaryapi.com/api/v3/references/collegiate/json/{printresult(word)}?key={api_key}'
    #print(api_url)
    correctcombos=0
    allcombos=0

    try:
        response = requests.get(api_url)
        if response.status_code == 200:
            confirm = response.json()
            #if confirm:
                #define = confirm[0].get('def', {}).get('{bc}', '')
                    
            if confirm and isinstance(confirm, list) and 'meta' in confirm[0]:
                metadata = confirm[0]['meta']
                #print(f"{printresult(word)} has metadata:")
                print(f"{printresult(word)} is a word")
                ++correctcombos
                ++allcombos

            else:
                ++allcombos
                #print("No metadata dude")

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
        check_word_existence(theword,'f25abb33-a3be-4049-8767-f3b871339adc')
    else:
        for iterator in range(startindex,endindex):
            theword[startindex],theword[iterator]=theword[iterator],theword[startindex]
            letsgotowork(theword,startindex+1,endindex)
            theword[iterator],theword[startindex]=theword[startindex],theword[iterator]


print('The Anagram Program...HI!')
userinput = input("Please type in the word in question: ")
endindex = len(userinput)
theword = list(userinput)
'''correctcombos=0
allcombos=0'''
letsgotowork(theword,0,endindex)
'''print(f"TOTAL COMBINATIONS: {allcombos}")   
print(f"ACTUAL WORDS: {correctcombos}") '''


'''apikey='f25abb33-a3be-4049-8767-f3b871339adc'
word='yrc'
apiurl = f'https://www.dictionaryapi.com/api/v3/references/collegiate/json/{word}?key={apikey}'
response = requests.get(apiurl)
if response.status_code == 200:
    confirm=response.json
    if check_word_existence(word):
        print(word + " is a word.")
    else:
        print("NOT A WORD")   
#letsgotowork(theword,0,endindex)'''

#Rest is invalid


'''
def checkwordexistence(checkword):
   apikey='f25abb33-a3be-4049-8767-f3b871339adc'
   apiurl = f'https://www.dictionaryapi.com/api/v3/references/collegiate/json/{checkword}?key={apikey}'
   response = requests.get(apiurl)
   if response.status_code==200:
    confirm=response.json
    if bool(confirm):
        print(printresult(checkword))
    else:
        print("INVALID WORD: " + printresult(checkword))
'''

