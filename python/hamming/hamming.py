def distance(strand_a, strand_b):
    d = 0
    i = 0
    if len(strand_a) == len(strand_b):
        while i < len(strand_a):
            if strand_a[i] != strand_b[i]:
                d += 1
            i += 1
        return d
    else:
        raise ValueError("Please check your strands, there's an error")
