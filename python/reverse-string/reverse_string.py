def reverse(input=''):
    i = len(input)
    word = ''
    while i > 0:
         word = word + input[i - 1]
         i = i - 1
    return word
