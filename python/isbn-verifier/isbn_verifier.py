import re
def verify(isbn):
    isbn = re.sub('[^0-9X]', '', isbn)
    i = 0
    j = 10
    erg = 0
    if len(isbn) != 10:
        return False
    else:
        if isbn[9] == "X":
            erg = 10
            isbn = isbn.replace("X", "0")
        while (i < 10 and j > 0):
            if isbn[i] == "X":
                return False
            else:    
                erg = erg + int(isbn[i]) * j
                i += 1
                j -= 1
        return (erg % 11 == 0)



