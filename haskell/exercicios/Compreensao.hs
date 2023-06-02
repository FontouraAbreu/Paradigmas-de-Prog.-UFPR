module Compreensao where
    compreensao :: [Int] -> [Int]
    compreensao lista = [x*3 | x <- lista]