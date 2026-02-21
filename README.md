### 🧠 Desafio de Reflexão

**Pergunta:** Por que precisamos criar uma classe Passageiro? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`?  
**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?

Criar uma classe **Passageiro** é essencial para organização e escalabilidade do sistema.

Usar variáveis soltas no `main` pode funcionar para poucos usuários, mas se o FiapRide tiver **1 milhão de usuários**, o código ficaria impossível de manter, buscar e expandir.

Com a classe **Passageiro**, cada usuário vira um objeto que pode ser armazenado em listas, manipulado facilmente e reutilizado no sistema. Isso traz:

- melhor organização
- reutilização de código
- manutenção mais simples
- maior escalabilidade

👉 Em resumo: variáveis soltas servem apenas para exemplos pequenos; a classe permite que o sistema cresça de forma estruturada e profissional.

## 📊 Diagrama de Classes

<p align="center">
  <img src="docs/project-diagram.png" width="700"/>
</p>