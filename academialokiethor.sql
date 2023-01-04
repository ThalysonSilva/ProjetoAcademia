-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 09-Dez-2022 às 22:56
-- Versão do servidor: 10.4.25-MariaDB
-- versão do PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `academialokiethor`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `alunoacademia`
--

CREATE TABLE `alunoacademia` (
  `id_aluno` int(11) NOT NULL,
  `al_nome` varchar(100) NOT NULL,
  `al_cpf` varchar(14) NOT NULL,
  `al_telefone` varchar(15) NOT NULL,
  `al_datanascimento` varchar(10) NOT NULL,
  `al_sexo` varchar(15) NOT NULL,
  `al_endereco` varchar(50) NOT NULL,
  `al_modalidade` varchar(20) NOT NULL,
  `al_valorapagar` int(11) NOT NULL,
  `al_datacadastro` varchar(10) NOT NULL,
  `al_situacao` varchar(20) NOT NULL,
  `al_multa` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `alunoacademia`
--

INSERT INTO `alunoacademia` (`id_aluno`, `al_nome`, `al_cpf`, `al_telefone`, `al_datanascimento`, `al_sexo`, `al_endereco`, `al_modalidade`, `al_valorapagar`, `al_datacadastro`, `al_situacao`, `al_multa`) VALUES
(1, 'JAILTON SANTOS DE SOUZA', '532.985.634-55', '(84)94545-4548', '09/11/2000', 'MASCULINO', 'RUA LIMA E SILVA', 'BÁSICO', 60, '01/11/2022', 'Ativo', 10),
(2, 'THALYSON SILVA SANTOS', '318.214.364-66', '(84)91356-6565', '01/11/1999', 'MASCULINO', 'RUA LIMA E SILVA 15', 'PREMIUM', 70, '01/11/2022', 'Ativo', 10),
(3, 'RODRIGO MARINHO', '516.519.818-98', '(19)48949-8494', '10/10/2000', 'MASCULINO', 'RUA ALMEIDA CASTRO 3', 'BÁSICO', 60, '01/11/2022', 'ATIVO', 10),
(4, 'FRANCISCO CAMARGO JR', '732.292.242-56', '(11)11111-1111', '01/12/1985', 'MASCULINO', '1111111', 'BÁSICO', 60, '11/11/2000', 'Ativo', 10),
(5, 'LUCIANO DA SILVA SANTOS', '880.535.485-63', '(11)11111-1111', '02/02/1999', 'MASCULINO', 'RUA LIMA E SILVA 18', 'BÁSICO', 60, '11/11/2022', 'Ativo', 10),
(6, 'JOAO FELIPE DOS SANTOS', '219.849.849-81', '(19)89191-9198', '10/10/2000', 'MASCULINO', 'AV PAULISTA', 'BÁSICO', 60, '11/12/2022', 'Ativo', 0),
(7, 'PEDRO PAULO DE SOUZA', '219.849.849-81', '(19)89191-9198', '10/10/2000', 'MASCULINO', 'AV PAULISTA', 'BÁSICO', 60, '11/12/2022', 'Ativo', 0),
(8, 'HERCULANO JUNIOR', '533.595.899-89', '(84)62389-9198', '20/10/2000', 'MASCULINO', 'RUA MAE LUIZA', 'BÁSICO', 60, '10/12/2022', 'Ativo', 0),
(9, 'HERCULANO JUNIOR', '533.595.899-89', '(84)62389-9198', '20/10/2000', 'MASCULINO', 'RUA MAE LUIZA', 'BÁSICO', 60, '10/12/2022', 'Ativo', 0),
(10, 'FRANKLIN TEOFILO', '256.349.828-56', '(84)97855-6654', '21/10/2000', 'MASCULINO', 'RUA LAGOA NOVA', 'GYMPASS', 80, '09/12/2022', 'Ativo', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionarioacademia`
--

CREATE TABLE `funcionarioacademia` (
  `id_funcionario` int(11) NOT NULL,
  `fun_nome` varchar(100) NOT NULL,
  `fun_dataNascimento` varchar(10) NOT NULL,
  `fun_sexo` varchar(20) NOT NULL,
  `fun_cpf` varchar(14) NOT NULL,
  `fun_rg` varchar(20) NOT NULL,
  `fun_telefone` varchar(20) DEFAULT NULL,
  `fun_celular` varchar(15) NOT NULL,
  `fun_estadocivil` varchar(20) NOT NULL,
  `fun_email` varchar(100) NOT NULL,
  `fun_dataadmissao` varchar(15) NOT NULL,
  `fun_salario` float NOT NULL,
  `fun_funcao` varchar(50) NOT NULL,
  `fun_tipo` varchar(15) NOT NULL,
  `fun_turno` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionarioacademia`
--

INSERT INTO `funcionarioacademia` (`id_funcionario`, `fun_nome`, `fun_dataNascimento`, `fun_sexo`, `fun_cpf`, `fun_rg`, `fun_telefone`, `fun_celular`, `fun_estadocivil`, `fun_email`, `fun_dataadmissao`, `fun_salario`, `fun_funcao`, `fun_tipo`, `fun_turno`) VALUES
(1, 'THALYSON OLIVEIRA JR', '01/10/1985', 'MASCULINO', '367.176.721-96', '001.150.600', '(84) 3124-4545', '(84) 98745-4545', 'SOLTEIRO', 'THALYSON@GMAIL.COM', '01/10/2000', 18500, 'PROFESSOR (A)', 'MENSALISTA', 'MANHÃ - TARDE'),
(2, 'PEDRO ALMEIDA DOS SANTOS', '01/12/1970', 'MASCULINO', '777.346.816-89', '011.245.564', '(84) 3211-4477', '(84) 94781-4560', 'CASADO', 'PEDROALMEIDA@GMAIL.COM', '01/02/2000', 12120, 'ATENDENTE', 'HORISTA', 'MANHÃ - TARDE'),
(3, 'THALYSON LINDO', '20/12/2000', 'MASCULINO', '326.899.484-91', '356.589.136', '(84) 9196-5189', '(84) 98798-1981', 'SOLTEIRO', 'MPTHALYSON@GMAIL.COM', '10/10/2022', 65116, 'PROFESSOR (A)', 'HORISTA', 'MANHÃ - TARDE'),
(4, 'RODRIGO RIBEIRO DOS SANTOS', '09/12/2000', 'MASCULINO', '186.858.578-64', '010.111.100', '(84) 3245-5454', '(84) 98787-8745', 'CASADO', 'RODRIGORIBEIRO@GMAIL.COM', '01/12/2022', 15000, 'ADMINISTRITIVO', 'MENSALISTA', 'MANHÃ - TARDE'),
(5, 'FELIPE DOS SANTOS SILVA', '01/02/1980', 'MASCULINO', '355.584.212-90', '111.111.545', '(84) 3211-3884', '(84) 98787-8487', 'DESQUITADO', 'FELIPEDOSSANTOS@GMAIL.COM', '01/11/2021', 90000, 'DIRETOR', 'AUTÔNOMO', 'MANHÃ - TARDE'),
(6, 'EDJANE SILVA', '09/12/1983', 'FEMININO', '317.986.203-32', '011.111.212', '(84) 3565-6565', '(84) 95959-5959', 'CASADO', 'EDJANE@GMAIL.COM', '01/12/2022', 15000, 'PROFESSOR (A)', 'MENSALISTA', 'MANHÃ - TARDE');

-- --------------------------------------------------------

--
-- Estrutura da tabela `profacademia`
--

CREATE TABLE `profacademia` (
  `id_professor` int(11) NOT NULL,
  `prof_nome` varchar(100) NOT NULL,
  `prof_datanascimento` varchar(15) NOT NULL,
  `prof_sexo` varchar(20) NOT NULL,
  `prof_cpf` varchar(14) NOT NULL,
  `prof_telefone` varchar(15) NOT NULL,
  `prof_endereco` varchar(100) NOT NULL,
  `prof_salario` float NOT NULL,
  `prof_funcao` varchar(100) NOT NULL,
  `prof_horastrabalhada` float NOT NULL,
  `prof_turno` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `profacademia`
--

INSERT INTO `profacademia` (`id_professor`, `prof_nome`, `prof_datanascimento`, `prof_sexo`, `prof_cpf`, `prof_telefone`, `prof_endereco`, `prof_salario`, `prof_funcao`, `prof_horastrabalhada`, `prof_turno`) VALUES
(1, 'RODRIGO DE OLIVEIRA RAMOS', '01/10/1985', 'MASCULINO', '627.273.247-31', '(84) 91445-6565', 'RUA LIMA E SILVA 15', 1500, 'PERSONAL', 44, 'MANHÃ - TARDE'),
(2, 'JOAO FILGUEIRADO SANTOS', '01/09/1956', 'MASCULINO', '673.373.736-19', '(84) 91245-0124', 'RUA SANTOS DUMULT 30', 1350, 'PERSONAL', 20, 'TARDE - NOITE');

-- --------------------------------------------------------

--
-- Estrutura da tabela `visitanteacademia`
--

CREATE TABLE `visitanteacademia` (
  `id_visitantes` int(11) NOT NULL,
  `vis_nome` varchar(100) NOT NULL,
  `vis_datanascimento` varchar(15) NOT NULL,
  `vis_telefone` varchar(15) NOT NULL,
  `vis_cpf` varchar(14) NOT NULL,
  `vis_sexo` varchar(20) NOT NULL,
  `vis_endereco` varchar(100) NOT NULL,
  `vis_valordiaria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `visitanteacademia`
--

INSERT INTO `visitanteacademia` (`id_visitantes`, `vis_nome`, `vis_datanascimento`, `vis_telefone`, `vis_cpf`, `vis_sexo`, `vis_endereco`, `vis_valordiaria`) VALUES
(1, 'RONALDO DE OLIVEIRA SANTOS', '01/12/1985', '(84) 91245-6878', '627.273.247-31', 'MASCULINO', 'RUA ALMEIDA CASTRO 15', 30),
(3, 'ANDRE LUIZ DE SOUZA', '09/12/1999', '(84) 91245-4648', '130.113.229-29', 'MASCULINO', 'RUA SANTIAGO SANTOS 15', 15);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `alunoacademia`
--
ALTER TABLE `alunoacademia`
  ADD PRIMARY KEY (`id_aluno`);

--
-- Índices para tabela `funcionarioacademia`
--
ALTER TABLE `funcionarioacademia`
  ADD PRIMARY KEY (`id_funcionario`);

--
-- Índices para tabela `profacademia`
--
ALTER TABLE `profacademia`
  ADD PRIMARY KEY (`id_professor`);

--
-- Índices para tabela `visitanteacademia`
--
ALTER TABLE `visitanteacademia`
  ADD PRIMARY KEY (`id_visitantes`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `alunoacademia`
--
ALTER TABLE `alunoacademia`
  MODIFY `id_aluno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de tabela `funcionarioacademia`
--
ALTER TABLE `funcionarioacademia`
  MODIFY `id_funcionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `profacademia`
--
ALTER TABLE `profacademia`
  MODIFY `id_professor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `visitanteacademia`
--
ALTER TABLE `visitanteacademia`
  MODIFY `id_visitantes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
