FROM python:3.8

ADD app.py requirements.txt /
RUN pip install -r requirements.txt

EXPOSE 8082
EXPOSE 8080

CMD [ "python", "./app.py" ]