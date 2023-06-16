module Tupla where
    -- 1
    type Triple = (String, String, Char)
    fst' :: Triple -> String
    fst' (x, _, _) = x

    snd' :: Triple -> String
    snd' (_, y, _) = y

    thd' :: Triple -> Char
    thd' (_, _, z) = z

    -- 2

    base :: Int -> (String, String, Char)
    base x
        |x == 1 = ("joao", "mestre", 'm')
        |x == 2 = ("jonas", "doutor", 'm')
        |x == 3 = ("joice", "mestre", 'f')
        |x == 4 = ("janete", "doutor", 'f')
        |x == 5 = ("jocileide", "doutor", 'f')
        |otherwise = ("ninguem", "", 'x')

    -- generate a list of tuples
    lista = [base x | x <- [0..5]]

    contMestre :: [Triple] -> Int
    contMestre [] = 0
    contMestre (h:t)
        | snd' h == "mestre" = 1 + contMestre t
        | otherwise = contMestre t

    contMD :: String -> [Triple] -> Int
    contMD titulo [] = 0
    contMD titulo (h:t)
        | snd' h == titulo = 1 + contMD titulo t
        | otherwise = contMD titulo t

    cont :: String -> Char -> [Triple] -> Int
    cont titulo sexo [] = 0
    cont titulo sexo (h:t)
        | snd' h == titulo && thd' h == sexo = 1 + cont titulo sexo t
        | otherwise = cont titulo sexo t

    retornaPesquisadores :: [Triple] -> [String]
    retornaPesquisadores [] = []
    retornaPesquisadores lista = [ nome | (nome, titulo, _) <- lista, titulo == "doutor"]