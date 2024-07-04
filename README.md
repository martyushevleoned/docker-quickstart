Список образов
```
docker images
```

Создать образ
```
docker build -t image-name .
```

Удалить образ
```
docker rmi -f image-id
```

Список контейнеров
```
docker container ls
```

Запустить контейнер
```
docker run -p 8000:8080 image-name
```

Остановить контейнер
```
docker stop container-id
```