<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
    <meta charset="UTF-8"/>
    <title>Добавить событие</title>
    <style>
        div{height: 70px}
        form{width: 500px;margin:  0 auto;margin-top: 0px;}
        button{margin-top: 50px;}
    </style>
    <!--   <link rel="stylesheet" href="/css/style.css"> -->
</head>
<body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js" integrity="sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em" crossorigin="anonymous"></script>
<form method="post" accept-charset="UTF-8">
    <div class="form-group">
        <label for="name">Наименование тренировки</label>
        <input type="text" class="form-control" id="name"  placeholder="" name="name">

    </div>
    <div class="form-group">
        <label for="description">Описание тренировки</label>
        <textarea class="form-control" id="description" placeholder="" name="description" row="5"></textarea>
    </div>
    <button type="submit" class="btn btn-primary">Сохранить</button>
</form>
</body>
</html>