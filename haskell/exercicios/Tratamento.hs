module Tratamento where
    addSr :: String -> String
    addSr "" = ""
    addSr nome = "Sr. " ++ nome

    addSra :: String -> String
    addSra "" = ""
    addSra nome = "Sra. " ++ nome

    addSrta :: String -> String
    addSrta "" = ""
    addSrta nome = "Srta. " ++ nome

    

    addPronome :: [String] -> (String -> String) -> [String]
    addPronome [] _ = [] -- caso base
    addPronome (h:t) f = f h : addPronome t f

    main :: IO()
    main = do
        let lista = ["joao","carlos","PEDRO","teles"]

        print(addPronome lista addSr)

        let lista = ["laura","jucileia","patricia","carla"]

        print(addPronome lista addSra)
        print(addPronome lista addSrta)


