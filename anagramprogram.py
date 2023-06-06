#print("The Ananagram Program...Hi!")
theword = input("Please type in the word in question:")

'''How this should be done: I'm thinking about using an API to connect and see what words can 
be created with each distinctive char. 

A type of sorting algorhthim might be called for in this situation to rearrange the chars/letters and 
see what word can be outputted. 

The first version of this program will probably just be outputting the rearranged letters and 
making sure that every order is accounted for (from there apply it in a arraylist/vector as long as
the data structure is dynamic.)'''


#Create if statements that checks whether there are any numbers in the input
nonumbersallowed = any(char.isdigit() for char in theword)


if(nonumbersallowed):
    print("NO NUMBERS ALLOWED.")
else:
    thewordagain = ""
    for x in theword:
        if theword.index(x) == 0:
            thewordagain[len(theword)] = theword
            print("New variation: " + thewordagain)

            #print("The first original char: " + x)
        '''else:
            thewordagain[theword.index(x)-1]=theword[theword.index(x)]
            print("New variation: " + thewordagain)
            #print(theword.index(x))
            #print("Char: " + x) '''



    print("These are all the possibilties:")

    #print("Words that can be created with " + theword)