module InverteLista where
    inverte :: [Float] -> [Float]
    inverte [] = []
    inverte (h:t) = inverte t ++[h]