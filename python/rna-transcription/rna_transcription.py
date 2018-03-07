def to_rna(dna_strand):
    i = 0
    rna = ""
    while i < len(dna_strand):
        if switchRna(dna_strand[i]) != "Error":
            rna = rna + switchRna(dna_strand[i])
            i = i+1
        else:
            raise ValueError ("Geht nicht!")

    return rna

def switchRna(dna):
    switcher = {
        "G": "C",
        "C": "G",
        "T": "A",
        "A": "U",
    }
    dna = switcher.get(dna, "Error")
    return dna
