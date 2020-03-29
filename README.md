INSTRUCTION:
1. Go to the main.java.com.mkaloshyn.javaio.chapter0304.myApp.MyAppMain 
2. Run myAppMain.main()
3. Follow the instructions on your console.

TASK:
Необходимо реализовать консольное CRUD приложение, которое имеет следующие сущности:

Employee
Department
Report
ReportStatus (enum APPROVED, UNDER_REVIEW, DELETED)

Department -> Set<Employee> employees + Report report
Report -> ReportStatus

В качестве хранилища данных необходимо использовать текстовые файлы:
employees.txt, departments.txt, reports.txt

Пользователь в консоли должен иметь возможность создания, получения, редактирования и удаления данных.

Слои:
model - POJO класы
repository - классы, реализующие доступ к текстовым файлам
controller - обработка запросов от пользователя
view - все данные, необходимые для работы с консолью
Например: Report, ReportRepository, ReportController, ReportView и т.д.
Для репозиторного слоя желательно использовать базовый интерфейс: 
interface GenericRepository<T,ID>

interface ReportRepository extends GenericRepository<Report, Long>

class JavaIOReportRepositoryImpl implements ReportRepository

Результатом выполнения задания должен быть отдельный репозиторий с README.md файлом, который содержит описание задачи, проекта и инструкции запуска приложения через командную строку.
