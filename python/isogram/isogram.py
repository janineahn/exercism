import re
def is_isogram(string):
    string = re.sub('[^a-zA-Z]', '', string)
    letters = len(string)
    isogram = len(set(string.lower()))
    if letters == isogram:
        return True
    else: 
        return False

