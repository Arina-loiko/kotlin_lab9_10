# Лабораторная работа №9-10: Продвинутое ООП на Kotlin

## Описание

Лабораторная работа посвящена изучению продвинутых концепций объектно-ориентированного программирования в Kotlin

## Темы

- Геттеры и сеттеры
- Инкапсуляция
- Data-классы
- Абстрактные классы
- Интерфейсы

## Структура проекта

```
src/
├── Main.kt                    - точка входа
├── actions/
│   └── ModuleAction.kt        - интерфейс действий
├── characters/
│   ├── Hero.kt                - класс героя с инкапсуляцией
│   └── OutpostWorker.kt       - класс работника базы
├── example/
│   ├── Interface.kt           - примеры интерфейсов
│   └── Test.kt                - примеры геттеров, data class, абстрактных классов
├── modules/
│   ├── OutpostModule.kt       - абстрактный класс модуля
│   ├── EnergyGenerator.kt     - генератор энергии
│   └── ResearchLab.kt         - исследовательская лаборатория
└── resources/
    ├── OutpostResource.kt     - data class ресурса
    └── ResourceManager.kt     - менеджер ресурсов
```

## Пример - интерфейсы

```kotlin
interface Movable {
    val speed: Int
    fun move()
    fun stop() {
        println("Stopping...")
    }
}

class Car(override val speed: Int, val model: String) : Movable {
    override fun move() {
        println("Car $model is moving at $speed km/h")
    }
}
```

## Как запустить проект

1. Клонируйте репозиторий:
```bash
git clone https://github.com/Arina-loiko/kotlin_lab9_10.git
```
2. Откройте проект в IntelliJ IDEA
3. Запустите любой пример через контекстное меню или напрямую из `main`

## Автор

Лойко Арина Станиславна, группа ИСП-232

## Лицензия

Проект создан в учебных целях
