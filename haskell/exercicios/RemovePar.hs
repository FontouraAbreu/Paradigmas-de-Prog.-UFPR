module RemovePar where
    removePar :: [Int] -> [Int]
    removePar [] = []
    removePar (h:t)
        | mod h 2 == 1 = h : removePar t
        | otherwise = removePar t