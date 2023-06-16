module Filtros where
    ehPositivo :: Int -> Bool
    ehPositivo n
        | n > 0 = True
        | otherwise = False

    ehNegativo :: Int -> Bool
    ehNegativo n
        | n < 0 = True
        | otherwise = False

    ehZero :: Int -> Bool
    ehZero n
        | n == 0 = True
        | otherwise = False

    filtraNumeros :: (Int -> Bool) -> [Int] -> [Int]
    filtraNumeros _ [] = []
    filtraNumeros f lista = [ x | x <- lista, f x == True]
    
    main :: IO()
    main = do
        let lista = [1,2,5,-6,-4,0,0,0,-21,54,5,-12,-1254,6,7]

        print(filtraNumeros ehNegativo lista)
        print(filtraNumeros ehPositivo lista)
        print(filtraNumeros ehZero lista)
