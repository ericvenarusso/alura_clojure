; Aula 02 - Comecando a usar funcoes

; Comparacoes
(= 10 6) ; false
(= 20 20) ; true
(= 15 15) ; true

; Diferente
(not= 10 10) ; false
(not= 10 20) ; true

; Funcao perdeu
(defn perdeu [] print "Você perdeu")

; Fazendo o jogo
(def total-de-vida 6)

(defn perdeu [] print "Você perdeu")

(defn jogo [vidas]
    (if (= vidas 0) 
    				(perdeu)
    				(do
    				    (print vidas)
    				    (jogo(dec vidas))
    				)
    )
)

; Funcao recursiva
(defn fib [n]
    (if (= n 0) 0
    (if (= n 1) 1
				(+ (fib (- n 1)) (fib (- n 2))))))