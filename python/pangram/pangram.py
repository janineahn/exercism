import re
def is_pangram(sentence = ""):
    sentence = re.sub('[^a-zA-Z]', '', sentence)
    if (len(set(sentence.lower())) == 26):
        return True
    else:
        return False
