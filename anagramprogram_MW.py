#https://www.dictionaryapi.com/api/v3/references/collegiate/json/dad?key=f25abb33-a3be-4049-8767-f3b871339adc
import sys
import requests
import os
import unittest
#from wordnik.swagger import *
#from wordnik import WordApi, swagger

allcombos=0
correctcombos=0

def printresult(printtheword):
    return ''.join(printtheword)

def check_word_existence(word,api_key='f25abb33-a3be-4049-8767-f3b871339adc'):

    api_url = f'https://www.dictionaryapi.com/api/v3/references/collegiate/json/{printresult(word)}?key={api_key}'
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
print(f"TOTAL LETTER COMBINATIONS: {allcombos}")   
print(f"ACTUAL WORDS FORMED: {correctcombos}")
