def capitalise_words(text):
    first_char = text[0]
    rest=text[1:]
    return first_char.upper()+rest

def reverse_string(text):
    length = len(text)
    word = []
    for i in range(length,0,-1):
        word+=text[i-1]
    return word