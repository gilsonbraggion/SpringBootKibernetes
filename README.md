# SpringBootKibernetes

Kubernetes

minikube start
Realiza o Start do Minikube

kubectl cluster-info
Se o endereço acima responder com uma URL é que o Kubernetes subiu certinho

Depois de executar os comandos do Docker para gerar a imagem.
Depois de rodar o comando do Kubectl para iniciar o serviço 

Rodar o comando minikube tunnel (Assim ele sincroniza o ambiente)

minikube docker-env

eval $(minikube -p minikube docker-env)

docker build . -t forketyfork/hello-world


Depois de alterado o código:

Realizar o Maven Build para gerar o novo JAR

Recompilar a Imagem do Docker
docker build -t spring-boot-test .   

Deletar a instância que tinha no Kubernetes
kubectl delete -f deployment.yaml

Recriar a instancia do Kubernetes
kubectl create -f deployment.yaml

Fazer o Kubernetes entender que a instancia é local e não está no Docker Hub
minikube docker-env  

Persistir as mudanças
eval $(minikube -p minikube docker-env)
