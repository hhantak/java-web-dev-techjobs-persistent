## Part 1: Test it with SQL

SELECT * FROM tech_jobs.job;
## Part 2: Test it with SQL

SELECT name FROM techjobs.employer
WHERE location = "St. Louis, MO"

## Part 3: Test it with SQL

DROP table techjobs.job;

## Part 4: Test it with SQL
SELECT
	name, description

FROM
	techjobs.skill

JOIN
	techjobs.job_skills ON techjobs.skills.id = techjobs.job_skills.skills_id

ORDER BY
	name ASC;