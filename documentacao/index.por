Inicio
 Meses31 = [1,3,5,7,8,10,12]
 Meses30 = [4,6,9,11]
 numeroDias = 0
 Index = 0
Repita enquanto Index < 7
 Se mesInformado Igual Meses31[Index]
 Calcule numeroDias = 31 * (mesInformado - 1) +
diaInformado
 Fim-Se
 Calcule Index = Index + 1
Fim-Repita
Index = 0
Repita enquanto Index < 4
 Se mesInformado Igual Meses30[Index]
 Calcule numeroDias = 30 * (mesInformado - 1) +
diaInformado
 Fim-Se
 Calcule Index = Index + 1
Fim-Repita
Se mesInformado > 2
 Calcule numeroDias = numeroDias + 1
Senão Se mês Igual 2
 Calcule numeroDias = 31 + diaInformado
Fim-Se
Imprima numeroDias
Fim