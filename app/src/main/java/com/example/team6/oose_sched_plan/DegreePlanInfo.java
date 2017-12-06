package com.example.team6.oose_sched_plan;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by tswal on 11/9/2017.
 */

public class DegreePlanInfo {
    public static void PopulateDatabase(SQLiteDatabase db){
        ContentValues values = new ContentValues();

        //Course Entries: Lines 21-890
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Rhetoric and Composition");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Introduction to college reading and writing. Emphasizes recursive writing processes, rhetorical analysis, synthesis of sources, and argument.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Calculus I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Concepts of limit, continuity, differentiation and integration; applications of these concepts. Prerequisite: A qualifying score on the Math Placement Test (MPT) is required to register for this course.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Calculus II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Applications of integration, techniques of integration, parametric equations, polar coordinates, sequences, and series. Prerequisite: C or better in MATH 1426 or HONR-SC 1426.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "PHYS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "General Technical Physics I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1443);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "The first half of a one-year technical course. Required for many science and engineering majors, exceeds premedical requirement. The study of physical phenomena in the fields of mechanics, heat, and waves. Concurrent enrollment in MATH 1426 (per prerequisite) is not recommended if no prior background in calculus. Prerequisite: MATH 1426 or consent of instructor.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "PHYS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "General Technical Physics II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1444);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "The second half of a one-year technical course. The study of physical phenomena including electricity, magnetism, circuit theory, light, and optics. Prerequisites: PHYS 1443 or equivalent and MATH 2425 or concurrent enrollment.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Contemporary Mathematics");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "This course covers material in a traditional algebra course together with real-world applications of mathematics. It develops problem-solving and critical thinking skills. Topics include the mathematics of dimensional analysis, mathematical logic, population growth, optimization, voting theory, number theory, graph theory, relations, functions, probability, statistics, and finance. The use of mathematical software and calculators is required. See course syllabus for details. Credit may be received for only one of MATH 1301, MATH 1302, or MATH 1315.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Preparation for Calculus");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1421);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "This course integrates and builds upon concepts and skills from college algebra and trigonometry that are essential to success in calculus. Problem solving activities form the basis for the establishment of these mathematical connections. Prerequisite: C or better in MATH 1301 or MATH 1302 or MATH 1315, or a qualifying score on Math Placement Test.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "College Algebra");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1302);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "This course is designed as preparation for higher level mathematics courses. Topics include the study of linear, quadratic, polynomial, rational, radical absolute value, logarithmic, and exponential functions, relations and inequalities; graphs, basic characteristics, and operations on functions; real and complex zeros of functions; graphing techniques; systems of equations and matrices. The use of mathematical software and calculators is required. See course syllabus for more details. Non-STEM (Science-Technology-Engineering-Mathematics) majors should enroll in MATH 1301, and Business majors should enroll in MATH 1315. Credit may be received for only one of MATH 1301, MATH 1302, or MATH 1315.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "College Algebra for Economics and Business Analysis");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1315);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "This course covers material in a traditional algebra course with emphasis on business and financial application. The application of common algebraic functions including polynomial, exponential, logarithmic, and rational, to problems in business, economics, and the social sciences are addressed. Additional topics include systems of linear equations and inequalities, linear programming, mathematics of finance, elements of matrix algebra, logic and probability including expected value. Credit may be received for only one of MATH 1301, MATH 1302, or MATH 1315.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ENGR");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Engineering Problem Solving");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1300);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Broad introduction to the profession of engineering and its different disciplines, through the process of applying the principles of mathematics to solve real-life engineering problems and technical writing assignments. Math topics are presented within the context of engineering applications and reinforced through examples from engineering courses. Also introduces algorithm development through the use of the engineering analysis software MATLAB. Prerequisite: C or better in MATH 1421 (or concurrent enrollment), or C or better in (or concurrent enrollment in) a subsequent mathematics course (MATH 1426, MATH 2425, MATH 2326, MATH 3319, HONR-SC 1426, HONR-SC 2425), or a qualifying score on the Math Placement Test (MPT).");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Engineering");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1104);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Introduction to basic engineering concepts. Students will become familiar with engineering and its many sub-fields, ethical responsibilities, creativity and design. Corequisite: CSE 1105.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction Computer Science and Engineering");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1105);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Introduction to engineering concepts, the computer science and engineering disciplines, skills for written communication, and departmental orientation.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Honors Calculus");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "A more rigorous introduction to calculus than that provided by MATH 1426. Assignments include essay questions and problems that involve research on the development, meaning, and history of concepts emphasized in the course. Students are challenged to master more difficult material in a broader disciplinary context. Credit will be given for MATH 1426 OR HONR 1426 but not both.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Honors Calculus II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "A more rigorous introduction to calculus than that provided by MATH 2425. Assignments include essay questions and problems that involve research on the development, meaning, and history of concepts emphasized in the course. Students are challenged to master more difficult material in a broader disciplinary context. Credit will be given for MATH 2425 or HONR 2425 but not both.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Computers and Programming");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1310);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "An introduction to the computer, to the algorithmic process, and to programming using basic control and data structures, using a procedural language. Prerequisite: C or better in MATH 1302 or C or better in (or concurrent enrollment in) a subsequent mathematics course (MATH 1421, MATH 1426, MATH 2425, MATH 2326, MATH 3330, HONR-SC 1426 or HONR-SC 2425) and C or better in CSE 1105 (or concurrent enrollment).");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Mathematical Introduction to Computers and Programming");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1312);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Substitute for CSE 1310, but with broader connections to mathematical problem-solving, basic code quality issues, and evaluation of program execution properties. Credit will not be given for both CSE 1310 and CSE 1312. Prerequisite: C or better in MATH 1421 or C or better in (or concurrent enrollment in) a subsequent mathematics course (MATH 1426, MATH 2425, MATH 2326, MATH 3330, HONR-SC 1426, or HONR-SC 2425) and C or better in CSE 1105 (or concurrent enrollment).");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Intermediate Programming");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1320);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Programming concepts beyond basic control and data structures. Emphasis is given to data structures including linked-lists and trees as well as modular design consistent with software engineering principles. Prerequisite: C or better in CSE 1310 or C or better in CSE 1312, and C or better in (or concurrent enrollment in) (MATH 1421, MATH 1426, MATH 2425, MATH 2326, MATH 3330, HONR-SC 1426, or HONR-SC 2425) and C or better in CSE 1105 (or concurrent enrollment).");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Object-Oriented Programming");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1325);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Object-oriented concepts, basic Unified Modeling Language (UML) modeling, collection classes, generics, polymorphism, reusability, and introduction to design patterns. Projects involve extensive programming and include graphical user interfaces and multithreading. Prerequisite: CSE 1320.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Practical Computer Hardware/Software Systems");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2100);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "A practical approach to hands-on computer hardware and software systems in a laboratory environment. Students will be exposed to basic design concepts using off-the-shelf hardware components and to tools that enable the design of complex software systems. Prerequisite: Corequisite CSE 2312.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Computer Organization and Assembly Language Programming");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2312);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Computer organization from the viewpoint of software, including: the memory hierarchy, instruction set architectures, memory addressing, input-output, integer and floating-point representation and arithmetic. The relationship of higher-level programming languages to the operating system and to instruction set architecture are explored. Some programming in an assembly language. Prerequisite: CSE 1320.");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Discrete Structures");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2315);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Propositional and predicate logic, mathematical proof techniques, sets, combinatorics, functions and relations, graphs, and graph algorithms. Prerequisites: C or better in CSE 1310 and MATH 1426 (or C or better in or concurrent enrollment in MATH 2425) and C or better in ENGR 1300 (or concurrent enrollment).");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Algorithms and Data Structures");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2320);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Design and analysis of algorithms with an emphasis on data structures. Approaches to analyzing lower bounds on problems and upper bounds on algorithms. Classical algorithm design techniques including algorithms for sorting, searching, and other operations on data structures such as hash tables, trees, graphs, strings, and advanced data structures, dynamic programming and greedy approaches. Prerequisite: CSE 1320 and CSE 2315.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Programming Languages");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3302);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Introduction, analysis, and evaluation of the important concepts found in a variety of programming languages. Formalisms useful in specifying language syntax and semantics; programming language paradigms such as algorithmic, functional, logic, and object-oriented. Prerequisite: C or better in each of the following: CSE 1325, CSE 2312 and CSE 2320.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Fundamentals of Software Engineering");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3310);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Software engineering principles, processes, and techniques; software development approaches focusing on functional analysis and functional design methods. Configuration management, implementation strategies, and testing. Team project. Prerequisite: C or better in each of the following: CSE 1325 and CSE 2315.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Theoretical Concepts in Computer Science and Engineering");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3315);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Selected theoretical concepts including regular and context free languages, finite state and pushdown automata, Turing machines, computability, and NP-completeness. Prerequisite: C or better in CSE 2315.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Operating Systems");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3320);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Functions and components of an operating system, including process synchronization, job scheduling, memory management, file systems protection, and deadlocks. Related system software, such as loaders, linkers, assemblers, and windowing systems. Prerequisite: C or better in each of the following: CSE 2312; and IE 3301 or MATH 3313 (or concurrently).");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Database Systems and File structures");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3330);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Database system architecture; file structures for databases, including indexing hashing, and B+-trees; the relational model and algebra; the SQL database language; Entity-Relationship data modeling; functional dependencies and basic normalization. Prerequisite: C or better in each of the following: CSE 1325 and CSE 2320.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Artificial Intelligence");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "FALL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4308);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "An introduction to the field of artificial intelligence studying basic techniques such as heuristic search, deduction, learning, problem solving, knowledge representation, uncertainty reasoning and symbolic programming languages such as LISP. Application areas may include intelligent agents, data mining, natural language, machine vision, planning and expert systems. Prerequisite: Admitted into an Engineering Professional Program. C or better in each of the following: CSE 2320 and IE 3301.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Professional Practices");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4314);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Ethics. Contemporary social aspects and responsibilities of computing in a global, societal context. Lifelong learning goals and resources. Entrepreneurship and intellectual property. Project involving written and oral communication. Prerequisite: Admitted into an Engineering Professional Program. C or better in COMS 2302.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Computer System Design Project I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4316);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Analysis and design of an industry-type project that involves hardware and software components to meet desired needs within realistic constraints and standards. The project is to be completed in CSE 4317 the following semester. Multidisciplinary teams of CSE 4316 students are required to develop, review, and present problem definition, project planning, requirements formulation, and design specification. Prerequisites: Admitted into an Engineering Professional Program. C or better in all of the following: CSE 3310, CSE 3320, and for CpE Majors CSE 3442. In addition CSE 4314 as co-requisite.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Embedded Systems");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3442);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "FALL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Design of microcomputer based systems: microcomputer programming, component and system architectures, memory interfacing, parallel and serial input/output ( I/O) interfacing, analog to digital (A/D) and digital to analog ( D/A) conversion, and typical applications. Prerequisite: C or better in each of the following: CSE 2100 and CSE 2441.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Digital Logic");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2441);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Analysis, design and testing of combinational and sequential logic circuits. Topics include Boolean algebra, logic circuit minimization techniques, synchronous sequential circuit design, algorithmic state machine design, design of arithmetic/logic and control units. Computer aided design tools and utilized throughout the course. Prerequisite: CSE 1320 and CSE 2315.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Computer System Design Project II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4317);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Implementation, integration, quality assurance through peer review and testing, and deployment of the project designed in CSE 4316; oral presentation, documentation and project demonstration. Prerequisite: Admitted into an Engineering Professional Program. C or better in CSE 4316 and continuation with the same team.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Computer Network Organization");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4344);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Design and analysis of computer networks. Emphasis on the OSI architecture but discusses other schemes (e.g., ARPAnet). Data link control, local networks, protocols/architectures, network access protocols, transport protocols, internetworking, and ISDN. Prerequisite: Admitted into an Engineering Professional Program. C or better in CSE 3320.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Computer Graphics");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4303);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "SPRING");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Theory and practice for the visual representation of data by computers including display devices, output primitives, planes and curved surfaces, two- and three-dimensional transformations, parallel and perspective viewing, removal of hidden lines and surfaces, illumination models, ray tracing, radiosity, color models, and computer animation. Prerequisite: Admitted into an Engineering Professional Program. C or better in each of the following: CSE 2320, and either CSE 3380 or MATH 3330.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Compilers for Algorithmic Languages");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4305);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "SPRING");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Review of programming language structures, translation, and storage allocation. Theory and practice of compilers and issues in compiler construction including parsing, intermediate code generation, local optimization problems such as register allocation, data-flow analysis, and global optimization. Prerequisite: Admitted into an Engineering Professional Program. C or better in the following: CSE 3302 and CSE 3315.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Autonomous Robot Design and Programming");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4360);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "FALL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "An introduction to robotics and the design and programming of autonomous robot systems. Topics include basic kinematics, dynamics, and control, as well as sensors, knowledge representation, and programming techniques. Course work includes individual and group projects involving the building and programming of simulated and real robots. Prerequisite: Admitted into an Engineering Professional Program. C or better in each of the following: CSE 2320, CSE 3320 and CSE 3380 (or MATH 3330).");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "IE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Engineering Probability");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3301);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Topics in engineering that involve random processes. Applications and backgrounds for topics in reliability, inventory systems, and queuing problems, including absolute and conditional probabilities, discrete and continuous random variables, parameter estimation, hypothesis testing, and an introduction to linear regression, experimental design, and analysis of variance. Prerequisite: MATH 2425.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Calculus III");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2326);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Vectors, dot product, cross product, planes, quadric surfaces, partial differentiation, multiple integrals (with applications), line integrals, Green's Theorem, surface integrals, Stokes' Theorem, divergence theorem. Prerequisite: C or better in MATH 2425 or HONR-SC 2425.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Probability");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3313);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Basic concepts in probability, random variables, probability distributions, functions of random variables, moment generating functions, central limit theorem and its role in statistics, joint probability functions and joint probability density functions, joint cumulative distribution functions, conditional and marginal probability distributions, covariance and correlation coefficients, transformation and order statistics. Offered as MATH 3313 and STATS 3313; credit will be granted in only one department. Prerequisite: C or better in MATH 2326.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Linear Algebra for CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3380);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Solving systems of equations, matrix algebra, determinants, vector spaces, orthogonality and least squares, with applications to computer science. Prerequisite: C or better in CSE 2315.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Matrices and Linear Algebra");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3330);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Solving systems of linear equations, matrix operations, determinants, vector spaces, linear transformation, orthogonality, Gram-Schmidt process, projections, and eigenvalues and eigenvectors. Prerequisite: C or better in MATH 1426 or HONR-SC 1426. MATH 2425 is strongly encouraged.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "COMS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Professional and Technical Communication for Science and Engineering");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2302);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Theory and practice in written and oral presentations with an emphasis on professional and technical communication for science and engineering. Prerequisites: 30 or more hours earned; ENGL 1301 and either ENGR 1300 or ENGL 1302.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Rhetoric and Composition");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1302);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Continues ENGL 1301, but with an emphasis on advanced techniques of academic argument. Includes issue identification, independent library research, analysis and evaluation of sources, and synthesis of sources with students' own claims, reasons, and evidence. Prerequisite: Grade of C or better in ENGL 1301.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "HIST");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "History of the United States to 1865");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1311);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "An introduction to the political, social, economic, and cultural history of the United States prior to 1865. This course is designed to help students understand and evaluate their society, comprehend the historical experience, and further develop reading and writing competencies and critical skills. Prerequisite: completion of or concurrent enrollment in ENGL 1301.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "HIST");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "History of the United States, 1865 to Present");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1312);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "An introduction to the political, social, economic, and cultural history of the United States since 1865. This course is designed to help students understand and evaluate their society, comprehend the historical experience, and further develop reading and writing competencies and critical skills. Prerequisite: completion of or concurrent enrollment in ENGL 1301.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "POLS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Government of the United States");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2311);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "The constitution and government of the United States. The organization, procedures, and duties of the branches of the government, together with their accomplishments and defects.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "POLS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "State and Local Government");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2312);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "The principles and organization of American state, county, and municipal government, together with current problems and the constitution and government of Texas.\n");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "IE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Economics for Engineers");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2308);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Methods used for determining the comparative financial desirability of engineering alternatives. Provides the student with the basic tools required to analyze engineering alternatives in terms of their worth and cost, an essential element of engineering practice. The student is introduced to the concept of the time value of money and the methodology of basic engineering economy techniques. The course will provide the student with the background to enable them to pass the Engineering Economy portion of the Fundamentals of Engineering exam. Prerequisites: MATH 1426 or concurrent enrollment.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ECON");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Principles of Macroeconomics");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2305);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Elementary models of the macroeconomy. Measures of aggregate economic activity and unemployment and inflation, money and banking, monetary and fiscal policy, international trade and payments, and applications of theory to society's problems.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Machine Learning");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4309);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "This course offers an introduction to machine learning. Topics include naive Bayes classifiers, linear regression, linear classificiers, neural networks and backpropagation, kernel methods, decision trees, feature selection, clustering, and reinforcement learning. A strong programming background is assumed, as well as familiarity with linear algebra (vector and matrix operations), and knowledge of basic probability theory and statistics. Prerequisite: Admitted into an Engineering Professional Program. C or better in each of the following: CSE 2320, IE 3301 and CSE 3380 or MATH 3330.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Computer Vision");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4310);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "This course introduces students to basic concepts and techniques in computer vision. The topics covered include moprhological operations, connected component analysis, image filters, edge detection, feature extraction, object detection, object recognition, tracking, gesture recognition, image formation and camera models, calibration, and stereo vision. A strong programming background is assumed, as well as familiarity with linear algebra (vector and matrix operations), and knowledge of basic probability theory and statistics. Prerequisite: Admitted into an Engineering Professional Program. C or better in each of the following: CSE 2320, IE 3301 and CSE 3380 or MATH 3330.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, " Modeling and Simulation");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4319);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Techniques for system modeling and simulation of stochastic and knowledge-based systems. Modeling methods, model validation and verification procedures, and steady state solution techniques. Prerequisite: Admitted into an Engineering Professional Program. C or better in each of the following: CSE 3310 and IE 3301.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Software and Testing Maintenance");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4321);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Study of software quality assurance, software testing, and software maintenance processes, methods and techniques including formal review techniques, software verification, validation, and testing, types of software maintenance, maintenance activities, and regression testing. Prerequisite: Admitted into an Engineering Professional Program. C or better in CSE 3310.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Project Software Management");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4322);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Introduction to software project management. Issues include effort estimation and costing, project planning and scheduling, option analysis, software quality assurance, and formal technical reviews. Prerequisite: Admitted into an Engineering Professional Program. C or better in CSE 3310.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Mobile Systems Engineering");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4340);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Mobile devices including hand-held computers, sensor nodes and smart phones, operating systems, middleware and communication in mobile environments. Applications of mobile systems in health, entertainment, security and other areas. Prerequisite: Admitted into an Engineering Professional Program. C or better in each of the following: CSE 3320, and CSE 4344 or concurrently.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Embedded Systems II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4342);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Advanced course in design of microcomputer-based systems. Emphasis is on the application of state-of-the-art microprocessors, microcomputers, and other LSI and VLSI components to real-time, interactive, and online problems. Prerequisite: Admitted into an Engineering Professional Program. C or better in each of the following: CSE 3442 and CSE 3313 (or con-currently).");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Parallel Processing");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4351);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Theory and practice of parallel processing, including characterization of parallel processors, models for memory, algorithms, and interprocess synchronization. Issues in parallelizing serial computations, efficiency and speedup analysis. Programming exercises using one or more concurrent programming languages, on one of more parallel computers. Prerequisite: Admitted into an Engineering Professional Program. C or better in CSE 3320.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Software Design Patterns");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4361);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "In-depth study of software design patterns including description of patterns, design principles and techniques used by patterns as well as application of patterns to solving practical design problems. Team project. Prerequisites: Admitted into an Engineering Professional Program. C or better in CSE 3311.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Unmanned Vehicle Systems");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4378);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Introduction to UVS (Unmanned Vehicle Systems) such as UAS (Unmanned Aircraft Systems), UGS (Unmanned Ground System) and UMS (Unmanned Maritime System), their history, missions, capabilities, types, configurations, subsystems, and the disciplines needed for UVS development and operation. UVS missions could include student competitions sponsored by various technical organizations. This course is team-taught by engineering faculty. Prerequisite: Admission to a professional engineering or science program.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Information Security");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4380);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Hands-on introduction to the basics of security. Includes system security, buffer overflows, a high-level overview of cryptography, firewalls and intrusion detection/prevention, malware, penetration testing, forensics, and system administration. Prerequisite: Admitted into an Engineering Professional Program. C or better in CSE 3320.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Theoretical Concepts in Computer Science and Engineering");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3315);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Selected theoretical concepts including regular and context free languages, finite state and pushdown automata, Turing machines, computability, and NP-completeness. Prerequisite: C or better in CSE 2315.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Mathematical Game Theory");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3303);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Two-person zero-sum games, solving matrix games by linear programming, two-person non-zero sum games, noncooperative n-person games, Nash equilibrium points and refinements, cooperative n-person games, core, Shapley value, and other concepts of solution. Applications to cost allocation, fair division, and voting power. Prerequisite: C or better in MATH 3330 or MATH 3319, or consent of the instructor.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Linear Optimization Applications");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3304);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "An introduction to basic methods of optimization with applications to optimal resource application, minimal cost allocation and interpersonal decision making in noncooperative and cooperative environments. Includes simplex method, duality, zero sum games, transportation and assignment. Prerequisite: C or better in MATH 3330 or MATH 3319.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "BIOL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Cell and Molecular Biology");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "(BIOL 1406) This course focuses on the chemical and molecular basis of life, including metabolism, cell structure and function, and genetics. Laboratory experiments and recitation are designed to complement theory presented in lecture. Formerly listed as BIOL 1449; credit will not be given for both.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CHEM");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "General Chemistry I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "The lecture covers the fundamentals of atomic structure, chemical bonding, the periodic table, nomenclature, kinetic theory, gas laws, chemical equations, and solutions. The laboratory introduces the scientific method, experiment design, data collection and analysis, as well as illustrates fundamental principles presented in the lecture. Students who have not had high school chemistry are advised to take an introductory chemistry course first. Prerequisite: MATH 1302 or MATH 1303 or MATH 1322 or MATH 1323 or MATH 1421 or MATH 1426 or MPT Algebra score =/> 17. Students must pass the departmental placement assignment.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CHEM");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Chemistry II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1442);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Study of advanced atomic structure and bonding concepts, acid-base theory, kinetics and equilibria, thermodynamics, electrochemistry, the chemistry of some elements. The laboratory focuses on experimental design, data collection and analyses as well as chemical syntheses to illustrate fundamental principles presented in the lecture. Prerequisite: CHEM 1441 or equivalent with a grade of C or better or (CHEM 1341 with a grade C or better).");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ANTH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Global Cultures");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2322);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Methods and theories of sociocultural anthropology. Examines systems of social organization and cultural meaning in contemporary human societies. Topics include fieldwork, cross-cultural analysis, applied anthropology, and global perspectives on political, economic, and social institutions. Formerly ANTH 3322; credit will not be granted for both ANTH 2322 and ANTH 3322.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ARCH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Masterworks of Western Architecture");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2300);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Selected architectural complexes as representative of various periods of Western culture. Stresses cultural relevance rather than stylistic analysis. Intended as humanities elective for non-architecture majors.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "The Art of Non-Western Traditions");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1317);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "This course is designed to introduce students to works of art in various media developed in isolation from the European tradition, including the arts of the Near East, Asia, the Ancient Americas, Africa, and Oceania. Using visual arts as a tool, this course will introduce students to the diverse social customs, religions, and beliefs of nonwestern peoples.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CLAS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Classical Mythology");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1300);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Major Greek and Roman myths and their influence, with emphasis on the visual arts from antiquity to the present, including popular films.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Topics in Literature");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2303);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Focus on a particular genre, theme, or issue to enable comparison and analysis of several texts. Emphasis on critical thinking, reading, and writing. Topics may include literature of the Cold War, working-class literature, environmental literature and film, or the Gothic as cultural text. May be repeated for credit when course content changes. Prerequisite: ENGL 1301.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "IE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Operations Research I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3315);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Introduction to the major deterministic techniques of operations research and their application to decision problems. Linear programming, integer programming, network analysis, dynamic programming, nonlinear programming. Course software is used. Project required. Prerequisite: MATH 2326 or concurrent enrollment.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CHEM");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Chemistry for Engineers");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1465);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "An introduction to important concepts and principles of chemistry with emphasis on areas considered most relevant in an engineering context. Topics include chemical stoichiometry, bonding, chemical thermodynamics, equilibria, electrochemistry, and kinetics. Engineering students may substitute the eight hour sequence CHEM 1441 and CHEM 1442 for this class, but not either CHEM 1441 or CHEM 1442 alone. Students who complete CHEM 1465 and subsequently change majors to curricula that require both CHEM 1441 and CHEM 1442 may substitute CHEM 1465 for CHEM 1441. Prerequisite: C or better in MATH 1322 or C or better in MATH 1323 or C or better in MATH 1421 (or concurrent enrollment) or MATH 1426 (or concurrent enrollment) or HONR-SC 1426 (or concurrent enrollment) or MATH 2425 (or concurrent enrollment) or HONR-SC 2425 (or concurrent enrollment).");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ARCH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Masterworks of Western Architecture");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2300);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Selected architectural complexes as representative of various periods of Western culture. Stresses cultural relevance rather than stylistic analysis. Intended as humanities elective for non-architecture majors.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "World Literature");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2309);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Significant works of world literature chosen from various national and cultural traditions, with focus on cross-cultural issues. These might include moral ambiguities across cultures, the transition from colonial to postcolonial, or the nature of translation. Examines at least three genres and six authors. Emphasis on critical thinking, reading, and writing. Prerequisite: ENGL 1301.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "British Literature");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2319);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Concentration on works of British literature with focus on how cultural, geographic, and political issues shape and reflect literature in a particular culture. Topics may include the nature of empire, Romantic conceptions of heroism, or literary representations of the sciences. Examines at least three genres and six authors. Emphasis on critical thinking, reading, and writing. Prerequisite: ENGL 1301.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "American Literature");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2329);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Concentration on works of American literature with focus on how cultural, geographic, and political issues shape and reflect literature in a particular culture. Topics might include the struggle to discover a national identity, the transition from war to postwar periods, or the tensions of a multicultural society. Examines at least three genres and six authors. Emphasis on critical thinking, reading, and writing. Prerequisites: ENGL 1301.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "GLOBAL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Global Issues");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2301);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Comparative perspectives on a broad range of cultural, linguistic, economic, political, and social issues confronting a globalized world today. Designed to draw attention to the multifaceted connections among nation-states, nongovernmental organizations, diverse ethnic, cultural and religious groups,and populations around the world. GLOBAL 2301 may be taken as a Liberal Arts elective. May not be repeated for credit. No Prerequisite.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "INTS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Popular Culture");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1310);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "This course will introduce students to the role of popular culture in American society. It examines culture as a process through which people make symbolic meaning out of the world. Since everyone has access to popular culture, it constructs the way that people think about the world around them. The course will explore the creation, production, dissemination, reception and consumption of popular culture.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        //===

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ARAB");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Arabic I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Multimedia Immersion in the culture and language of Arabic-speaking countries. Designed to enable students to understand and communicate effectively in Arabic at the beginning level. Credit will not be granted to native speakers of Arabic. No prerequisites.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CHIN");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Chinese I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Multimedia immersion in the culture and language of China. Designed to enable students to understand and communicate effectively in Chinese at the beginning level. No prerequisites.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "FREN");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning French I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Multimedia immersion in the culture and language of French-speaking countries. Designed to enable students to understand and communicate effectively in French at the beginning level. No prerequisites.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "GERM");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning German I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Multimedia immersion in the culture and language of German-speaking countries. Designed to enable students to understand and communicate effectively in German at the beginning level.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "GREK");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Greek I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "n/a");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "KORE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Korean I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Multimedia immersion in the culture and language of Korea. Designed to enable students to understand and communicate effectively in Korean at the beginning level.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "LATN");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Latin Level I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "(LATN 1411).");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "PORT");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Portuguese I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Multimedia immersion in the culture and language of Portuguese-speaking countries. Designed to enable students to understand and communicate effectively in Portuguese at the beginning level. No prerequisites.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "RUSS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Russian I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Multimedia immersion in the culture and language of Russian-speaking countries. Designed to enable students to understand and communicate effectively in Russian at the beginning level. No prerequisites.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "SPAN");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Spanish I");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Beginning study of Spanish language with emphasis on speaking, listening, reading, and writing. No prerequisites. Native or heritage speakers of Spanish may not take this course.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();
        //===

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ARAB");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Arabic II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1442);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Continuation of beginning Arabic. Credit will not be granted to native speakers of Arabic. Prerequisite: ARAB 1441 with a grade of C or better.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CHIN");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Chinese II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1442);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Continuation of beginning Chinese. Prerequisite: CHIN 1441 with a grade of C or better.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "FREN");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning French II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1442);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Continuation of beginning French. Prerequisite: FREN 1441 with a grade of C or better.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "GERM");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning German II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1442);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Continuation of beginning German. Prerequisite: GERM 1441 with a grade of C or better.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "GREK");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Greek II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1442);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Prerequisite: GREK 1441 or equivalent.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "KORE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Korean II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1442);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Continuation of Beginning Korean I. Prerequisite: KORE 1441 with a grade of C or better.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "LATN");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Latin Level II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1442);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Prerequisite: LATN 1441 or equivalent.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "PORT");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Portuguese II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1442);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Continuation of beginning Portuguese. Prerequisite: PORT 1441 with a grade of C or better.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "RUSS");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Russian II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1442);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Continuation of beginning Russian. Prerequisite: RUSS 1441 with a grade of C or better.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "SPAN");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Beginning Spanish II");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1442);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Continuation of beginning Spanish. Prerequisite: SPAN 1441 with a grade of C or better. Native or heritage speakers of Spanish may not take this course.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "LING");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Language in a Multicultural USA");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2371);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "The relationship between language in the U.S. and social power. This course explores how negative attitudes toward some language varieties and languages spoken in the U.S. arise from social factors, rather than features of the languages themselves. In addition to studying language varieties, the course shows how American institutions such as the educational system and the media reinforce these negative attitudes and contribute to discrimination.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "PHIL");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Contemporary Moral Problems");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1304);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "(PHIL 2306). Examination of ethical problems and theories which have a bearing on contemporary life. Texts may include both classical and contemporary ethical writings and deal with problems such as the conditions under which life may be taken (abortion, capital punishment, medical ethics), business ethics, social justice, and individual rights.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ARCH");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Architecture and Interior Design");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "The interrelationships between society, culture, and the built environment. Prerequisite: Department consent.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Art Appreciation");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Intended to develop an understanding, appreciation, and enjoyment of art in its many forms. Recommended as a fine arts elective for non-art majors.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Art of the Western World I: Greece Through Renaissance");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1309);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Major developments in art, from Archaic Greece through the European Renaissance.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Art of the Western World II: Baroque to Modern");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1310);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Music Appreciation");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1300);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Open to all students as fine arts elective, designed to develop intelligent listening and enjoyment of music. Provides an opportunity to increase the student's cultural experience and vocabulary.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Jazz Appreciation");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1302);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Open to all students as fine arts elective. The development of American jazz from its African and European roots to the present.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to World Music");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2300);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Open to all students as fine arts elective. The music of Asia, Africa, and Oceania and the native traditions of the Americas; the role of music in the world's societies and non-Western music systems.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Appreciation of Music in Film");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 2301);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Open to all students as fine arts elective. A study of the history, compositional styles and impact of music in films during the 20th century.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "THEA");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Theatre and Film Appreciation");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1342);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Develops awareness of and appreciation for dramatic art as reflected in theatre and film. Designed to increase the student's enjoyment and knowledge of drama and its historical, social and cultural contexts. Students may be required to attend plays. Theatre Arts BFA and BA majors and minors may not use this course in place of THEA 1343. This course satisfies the University of Texas at Arlington core curriculum requirement in Creative Arts.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "THEA");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Theatre");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 1343);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Acquaints the student with major phases of theatrical activity and production research. Considers the duties and contributions of director, actor, scene designer, costumer, and others involved in play production. Students may be required to attend and review productions. This course satisfies the University of Texas at Arlington core curriculum requirement in Creative Arts.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Data Mining");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4334);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Automatic discovery of patterns and knowledge from large data repositories, including databases, data warehouses, Web, document collections, and transactions. Basic topics of data mining including data preprocessing, data warehousing and online analytical processing (OLAP), data cube, frequent pattern and association rule mining, correlation analysis, classification and prediction and clustering, as well as advanced topics covering the techniques and applications of data mining on Web and text documents. Prerequisite: Admitted into an Engineering Professional Program. C or better in each of the following: IE 3301 (or MATH 3313). Co-requisite: CSE 3330.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Quantitative Computer Architecture");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4323);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Pipelined processors, parallel processors including shared and distributed memory, multicore, Very Long Instruction Word (VLIW) and graphics processors, memory and cache design, computer peripherals, and computer clusters. Prerequisite: Admitted into an Engineering Professional Program. C or better in CSE 3320.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Database Implementation and Theory");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4331);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "Review of the relational model and algebra; relational calculus; relational database design theory; advanced data modeling concepts; object-oriented and object-relational databases; database system implementation techniques, including concurrency control, recovery, atomic commitment, and query processing and optimization, database security; introduction to advanced concepts, such as active, deductive, spatial, temporal, multimedia and distributed databases. Prerequisite: Admitted into an Engineering Professional Program. C or better in CSE 3330.");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Comptational Methods");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4345);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Introduction to numerical methods for solving problems in computer science and computer engineering. Topics include computer arithmetic, linear and nonlinear equations, eigenvalue problems, least squares, optimization, interpolation, and simulation. Prerequisite: Admitted into an Engineering Professional Program. C or better in each of the following IE 3301, CSE 2320, and either CSE 3380 or MATH 3330.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Object-Oriented Software Engineering");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3311);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Study of an agile unified methodology and its application to object-oriented software development. Topics include requirements acquisition, use case derivation, modeling and design of interaction behavior and state behavior, introduction to design patterns, derivation of design class diagrams, implementation considerations and deployment. Team project. Prerequisite: C or better in each of the following: CSE 2320 and CSE 3310.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Introduction to Signal Processing");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 3313);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Examines models for presentation and processing of digital signals. Sampling theorem, correlation and convolution, time and frequency analysis of linear systems, Fourier transform, Z-transform, design of digital filters structures for discrete time systems. Prerequisite: C or better in each of the following: CSE 2320 and either CSE 3380 or MATH 3330.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);
        values = new ContentValues();

        values.put(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NAME, "Computational Methods");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_NUMBER, 4345);
        values.put(DegreePlanAdapter.CourseEntry.COURSE_TERM, "");
        values.put(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION, "Introduction to numerical methods for solving problems in computer science and computer engineering. Topics include computer arithmetic, linear and nonlinear equations, eigenvalue problems, least squares, optimization, interpolation, and simulation. Prerequisite: Admitted into an Engineering Professional Program. C or better in each of the following IE 3301, CSE 2320, and either CSE 3380 or MATH 3330.");
        db.insert(DegreePlanAdapter.CourseEntry.TABLE_NAME, null, values);


        //Degree Plans: Lines 892 - 927
        values = new ContentValues();
        values.put(DegreePlanAdapter.DegreePlanTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.DegreePlanTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.DegreePlanTable.REQUIRED_COURSE_HOURS, 127);
        values.put(DegreePlanAdapter.DegreePlanTable.TECHNICAL_ELECTIVE_HOURS, 12);
        values.put(DegreePlanAdapter.DegreePlanTable.MATH_ELECTIVE_HOURS, 3);
        values.put(DegreePlanAdapter.DegreePlanTable.SCIENCE_ELECTIVE_HOURS, 4);
        values.put(DegreePlanAdapter.DegreePlanTable.CREATIVE_ARTS_ELECTIVE_HOURS, 3);
        values.put(DegreePlanAdapter.DegreePlanTable.PHILOSOPHICAL_ELECTIVE_HOURS, 3);
        db.insert(DegreePlanAdapter.DegreePlanTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.DegreePlanTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.DegreePlanTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.DegreePlanTable.REQUIRED_COURSE_HOURS, 127);
        values.put(DegreePlanAdapter.DegreePlanTable.TECHNICAL_ELECTIVE_HOURS, 9);
        values.put(DegreePlanAdapter.DegreePlanTable.MATH_ELECTIVE_HOURS, 3);
        values.put(DegreePlanAdapter.DegreePlanTable.SCIENCE_ELECTIVE_HOURS, 4);
        values.put(DegreePlanAdapter.DegreePlanTable.CREATIVE_ARTS_ELECTIVE_HOURS, 3);
        values.put(DegreePlanAdapter.DegreePlanTable.PHILOSOPHICAL_ELECTIVE_HOURS, 3);
        db.insert(DegreePlanAdapter.DegreePlanTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.DegreePlanTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.DegreePlanTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.DegreePlanTable.REQUIRED_COURSE_HOURS, 127);
        values.put(DegreePlanAdapter.DegreePlanTable.TECHNICAL_ELECTIVE_HOURS, 3);
        values.put(DegreePlanAdapter.DegreePlanTable.MATH_ELECTIVE_HOURS, 3);
        values.put(DegreePlanAdapter.DegreePlanTable.SCIENCE_ELECTIVE_HOURS, 4);
        values.put(DegreePlanAdapter.DegreePlanTable.CREATIVE_ARTS_ELECTIVE_HOURS, 3);
        values.put(DegreePlanAdapter.DegreePlanTable.PHILOSOPHICAL_ELECTIVE_HOURS, 3);
        db.insert(DegreePlanAdapter.DegreePlanTable.TABLE_NAME, null, values);


        //Electives: Lines 929-2462
        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4303);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4305);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4308);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);



        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4309);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4310);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4319);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4321);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4322);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4340);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4342);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4345);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4351);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4360);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4361);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4378);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4380);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3315);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);



        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3330);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2326);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "MATH");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3315);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "MATH");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3303);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "MATH");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3304);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "MATH");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4345);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "MATH");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "BIOL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "SCIENCE");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CHEM");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "SCIENCE");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CHEM");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1465);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "SCIENCE");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ANTH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2322);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ARAB");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ARCH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2300);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1317);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CHIN");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CLAS");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1300);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2303);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2309);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2319);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2329);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "FREN");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "GERM");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2314);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "GLOBAL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2301);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "GREK");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "INTS");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1310);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "KORE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "LATN");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "LING");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2371);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "PHIL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1304);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "PORT");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "RUSS");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "SPAN");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ARCH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1309);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1310);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1300);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1302);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2300);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2301);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "THEA");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1342);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "THEA");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1343);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);
        values = new ContentValues();


        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4303);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4305);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4309);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4310);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4319);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4321);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4322);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4323);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4331);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4334);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4340);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4345);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4351);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4360);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4361);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4378);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4380);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3311);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3313);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "IE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3315);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2326);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "MATH");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3303);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "MATH");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3304);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "MATH");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4345);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "MATH");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "BIOL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "SCIENCE");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CHEM");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "SCIENCE");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CHEM");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1465);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "SCIENCE");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ANTH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2322);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ARAB");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ARCH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2300);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1317);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CHIN");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CLAS");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1300);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2303);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2309);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2319);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2329);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "FREN");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "GERM");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "GLOBAL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2301);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "GREK");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "INTS");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1310);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "KORE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "LATN");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "LING");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2371);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "PHIL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1304);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "PORT");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "RUSS");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "SPAN");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ARCH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1309);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1310);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1300);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1302);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2300);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2301);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "THEA");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1342);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "THEA");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1343);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4303);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4305);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4309);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4310);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4319);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4323);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4331);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4334);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4340);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);



        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4344);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4345);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4351);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4360);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4378);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4380);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3313);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "IE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3315);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "TECHNICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2326);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "MATH");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3303);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "MATH");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 3304);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "MATH");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 4345);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "MATH");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "BIOL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "SCIENCE");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CHEM");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "SCIENCE");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CHEM");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1465);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "SCIENCE");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ANTH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2322);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ARAB");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ARCH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2300);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1317);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CHIN");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "CLAS");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1300);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2303);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2309);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2319);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2329);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "FREN");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "GERM");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "GLOBAL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2301);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "GREK");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "INTS");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1310);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "KORE");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "LATIN");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "LING");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2371);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "PHIL");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1304);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "PORT");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "RUSS");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "SPAN");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "PHILOSOPHICAL");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ARCH");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1309);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "ART");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1310);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1300);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1302);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2300);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "MUSI");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 2301);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "THEA");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1342);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.ElectiveTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT, "THEA");
        values.put(DegreePlanAdapter.ElectiveTable.COURSE_NUMBER, 1343);
        values.put(DegreePlanAdapter.ElectiveTable.ELECTIVE_TYPE, "CREATIVE_ARTS");
        db.insert(DegreePlanAdapter.ElectiveTable.TABLE_NAME, null, values);


        //Required Courses: Lines 2464 - 3165
        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1301);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1426);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2425);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "PHYS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1443);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "PHYS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1444);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "ENGR");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1300);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);



        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1105);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1320);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1325);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);



        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2100);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2312);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2315);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2320);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2440);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2441);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);



        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3310);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3313);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3320);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3323);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3442);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4314);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4316);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4317);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4323);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4344);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "COMS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2302);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "HIST");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1311);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "HIST");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1312);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "POLS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2311);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "POLS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2312);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1301);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1426);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2425);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "PHYS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1443);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "PHYS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1444);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "ENGR");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1300);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);



        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1105);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1320);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1325);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);



        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2100);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2312);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2315);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2320);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3302);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3310);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3315);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3320);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3330);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4308);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4314);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4316);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4317);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4344);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "COMS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2302);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "HIST");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1311);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "HIST");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1312);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "POLS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2311);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "POLS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2312);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1301);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1426);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2425);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "PHYS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1443);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "PHYS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1444);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "ENGR");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1300);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);



        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1105);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1320);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1325);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);



        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2100);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2312);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2315);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2320);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3302);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3310);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3311);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3315);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3320);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 3330);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4314);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4316);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4317);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4321);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4322);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 4361);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "COMS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2302);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "HIST");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1311);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "HIST");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 1312);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "POLS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2311);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME, "SE");
        values.put(DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR, 2017);
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT, "POLS");
        values.put(DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER, 2312);
        db.insert(DegreePlanAdapter.RequiredCourseTable.TABLE_NAME, null, values);


        //Requisite Courses: 3167 - 4263
        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CHEM");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1441);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1302);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CHEM");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1441);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1303);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CHEM");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1441);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1322);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CHEM");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1441);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1323);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CHEM");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1441);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1421);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CHEM");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1441);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CHEM");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1442);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CHEM");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1441);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"COMS");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2302);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"COMS");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2302);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "ENGR");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1300);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"COMS");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2302);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "ENGR");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1302);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1104);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1105);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1302);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1421);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2326);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1105);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1421);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2326);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1105);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);


        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1421);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2326);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1105);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 3);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 3);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1325);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2100);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2315);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2315);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "ENGR");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1300);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2315);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 3);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2315);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -3);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2315);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2441);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2441);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2315);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3302);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1325);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3302);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3302);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 3);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1325);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2315);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3315);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2315);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "IE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3313);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1325);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3380);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2315);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3442);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2100);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3442);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2441);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4303);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4303);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3380);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4303);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4305);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3302);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4305);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3315);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4308);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4308);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "IE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4309);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4309);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "IE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4309);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3380);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 3);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4309);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 3);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "IE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3380);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 3);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 3);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4314);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "COMS");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2302);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4316);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4316);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4316);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 4314);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -3);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4317);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 4316);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4319);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4319);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "IE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4321);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4322);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3310);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4334);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "IE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4334);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3313);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4334);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4340);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4340);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 4344);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER, 4342);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3442);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4342);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3313);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4344);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4351);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4360);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4360);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4360);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3380);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 3);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4360);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 3);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4361);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3311);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,4380);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "CSE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3320);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"ENGL");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1302);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"ENGL");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2303);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"ENGL");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2309);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"ENGL");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2319);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"ENGL");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2329);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"ENGR");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1300);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1421);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"ENGR");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1300);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"ENGR");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1300);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"ENGR");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1300);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2326);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"ENGR");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1300);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3319);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"ENGR");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1300);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"ENGR");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1300);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"HIST");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1311);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"HIST");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1312);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "ENGL");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"IE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2308);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"IE");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1421);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1301);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1421);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1302);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1421);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1315);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2326);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2326);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3303);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3303);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3319);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3304);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3304);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 3319);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3313);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2326);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3315);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2326);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,3330);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "HONR_SC");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"PHYS");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1443);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1426);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"PHYS");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1444);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "PHYS");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1443);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"PHYS");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1444);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "MATH");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 2425);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, -2);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,"PHYS");
        values.put(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,1444);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT, "PHYS");
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER, 1443);
        values.put(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY, 1);
        db.insert(DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME, null, values);
    }

    /********************************************************************
     *
     * @param {String} major - All-caps major department
     * @param {Int} year - Year for which the degree plan started in
     * @param {Context} context - Application context
     * @return
     */
    public static ArrayList<Course> QueryCourses(String major, int year, Context context){
        ArrayList<Course> results = new ArrayList<Course>();
        DegreePlanAdapter.FeedReaderDbHelper mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(context);
        SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();

        //Queries major based on input*****************************************************************************
        String[] projection = {
                DegreePlanAdapter.DegreePlanTable.MAJOR_NAME,
                DegreePlanAdapter.DegreePlanTable.MAJOR_YEAR
        };

        String selection = DegreePlanAdapter.DegreePlanTable.MAJOR_NAME + " = ? AND " + DegreePlanAdapter.DegreePlanTable.MAJOR_YEAR + " = ?";
        String[] selectionArgs = {
                major,
                String.valueOf(year)
        };

        Cursor cursor = dbRead.query(
                DegreePlanAdapter.DegreePlanTable.TABLE_NAME,
                projection,
                selection,
                selectionArgs,
                null,
                null,
                null

        );

        //If major is found, save information for future queries*************************************************
        String majorName ="";
        int majorYear = 0;
        if(cursor.getCount() == 1) {
            cursor.moveToNext();
            majorName = cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.DegreePlanTable.MAJOR_NAME));
            majorYear = cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.DegreePlanTable.MAJOR_YEAR));
        }

        //Course results criteria instantiation******************************************************************
        String[] courseProjection = {
                DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT,
                DegreePlanAdapter.CourseEntry.COURSE_NUMBER,
                DegreePlanAdapter.CourseEntry.COURSE_NAME,
                DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION
        };
        String courseSelection = DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT + " = ? AND " + DegreePlanAdapter.CourseEntry.COURSE_NUMBER + " = ?";
        String[] courseSelectionArgs = new String[2];

        //Nested query criteria instantiation*******************************************************************
        String[] requiredCourseProjection = {
                DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT,
                DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER
        };

        String requiredCourseSelection = DegreePlanAdapter.RequiredCourseTable.MAJOR_NAME + " = ? AND " + DegreePlanAdapter.RequiredCourseTable.MAJOR_YEAR + " = ?";
        String[] requiredCourseSelectionArgs = {
                majorName,
                String.valueOf(majorYear)
        };

        //Query for courses that are required in input major***************************************************
        cursor = dbRead.query(
                DegreePlanAdapter.RequiredCourseTable.TABLE_NAME,
                requiredCourseProjection,
                requiredCourseSelection,
                requiredCourseSelectionArgs,
                null,
                null,
                null
        );


        String courseDepartment;
        int courseNumber;
        Cursor nestedCursor = null;

        //Iterate through each required course and gather that course's information from course entry table**********
        while(cursor.moveToNext()){
            courseDepartment = cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequiredCourseTable.COURSE_DEPARTMENT));
            courseNumber = cursor.getInt(cursor.getColumnIndexOrThrow((DegreePlanAdapter.RequiredCourseTable.COURSE_NUMBER)));
            courseSelectionArgs[0] = courseDepartment;
            courseSelectionArgs[1] = String.valueOf(courseNumber);
            nestedCursor = dbRead.query(
                    DegreePlanAdapter.CourseEntry.TABLE_NAME,
                    courseProjection,
                    courseSelection,
                    courseSelectionArgs,
                    null,
                    null,
                    null
            );
            nestedCursor.moveToNext();
            results.add(new Course(
                    Department.valueOf(nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT))),
                    nestedCursor.getInt(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NUMBER)),
                    nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NAME)),
                    nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION)))
            );
        }

        //Set selection criteria to elective table's format***********************************************************
        requiredCourseProjection[0] = DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT;
        requiredCourseProjection[1] = DegreePlanAdapter.ElectiveTable.COURSE_NUMBER;

        requiredCourseSelection = DegreePlanAdapter.ElectiveTable.MAJOR_NAME + " = ? AND " + DegreePlanAdapter.ElectiveTable.MAJOR_YEAR + " = ?";


        //Query electives for input major****************************************************************************
        cursor = dbRead.query(
                DegreePlanAdapter.ElectiveTable.TABLE_NAME,
                requiredCourseProjection,
                requiredCourseSelection,
                requiredCourseSelectionArgs,
                null,
                null,
                null
        );

        //Iterate through each elective and gather course's information from course entry table*********************
        while(cursor.moveToNext()){
            courseDepartment = cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.ElectiveTable.COURSE_DEPARTMENT));
            courseNumber = cursor.getInt(cursor.getColumnIndexOrThrow((DegreePlanAdapter.ElectiveTable.COURSE_NUMBER)));
            courseSelectionArgs[0] = courseDepartment;
            courseSelectionArgs[1] = String.valueOf(courseNumber);
            nestedCursor = dbRead.query(
                    DegreePlanAdapter.CourseEntry.TABLE_NAME,
                    courseProjection,
                    courseSelection,
                    courseSelectionArgs,
                    null,
                    null,
                    null
            );
            nestedCursor.moveToNext();
            results.add(new Course(
                    Department.valueOf(nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT))),
                    nestedCursor.getInt(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NUMBER)),
                    nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NAME)),
                    nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION)))
            );
        }
        cursor.close();
        nestedCursor.close();
        return results;
    }


    /****************************************************************************
     *
     *
     * @param {FeedReaderHelper} mDbHelper - FeedReaderHelper with the application context
     * @param {Course} course - Course for which to look up requisites
     * @return {ReqQueryResult} - Object that has corequisite flag and a 2D list of requisites grouped
     * together by alternate requirement status
     */

    public static ReqQueryResult QueryPrereqs(DegreePlanAdapter.FeedReaderDbHelper mDbHelper, Course course){
        ReqQueryResult result = new ReqQueryResult();
        SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();

        //Dummy variables for nested queries********************************************************************
        Department dummyDepartment;
        int dummyNumber;
        String dummyName;
        String dummyDescription;
        int dummyKey = 0;

        //Query criteria instantiation for requested course**************************************************
        String[] projection = {
                DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,
                DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,
                DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT,
                DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER,
                DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY
        };

        String selection = DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT + " = ? AND " + DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER + " = ?";
        String[] selectionArgs = {course.department.toString(), Integer.toString(course.number)};

        //Query requested course's requisites************************************************************************
        Cursor cursor = dbRead.query(
                DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME,
                projection,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        Cursor nestedCursor;
        String[] nestedProjection = {
                DegreePlanAdapter.CourseEntry.COURSE_NAME,
                DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION
        };
        String[] nestedSelectionArgs = new String[2];
        String nestedSelection = DegreePlanAdapter.CourseEntry.COURSE_DEPARTMENT + " = ? AND " + DegreePlanAdapter.CourseEntry.COURSE_NUMBER + " = ?";

        //Gather information of each requisite from course entry table**************************************************
        while(cursor.moveToNext()) {
            dummyDepartment = Department.valueOf(cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT)));
            dummyNumber = cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER));
            if(dummyKey != Math.abs(cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY)))) {
                result.reqs.add(new ArrayList<ReqCourseEntry>());
                dummyKey = Math.abs(cursor.getInt(cursor.getColumnIndexOrThrow((DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY))));
            }
            nestedSelectionArgs[0] =  dummyDepartment.toString();
            nestedSelectionArgs[1] = Integer.toString(dummyNumber);

            nestedCursor = dbRead.query(
                    DegreePlanAdapter.CourseEntry.TABLE_NAME,
                    nestedProjection,
                    nestedSelection,
                    nestedSelectionArgs,
                    null,
                    null,
                    null
            );
            nestedCursor.moveToNext();
            if(cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY)) < 0) {
                result.reqs.get(result.reqs.size() - 1).add(new ReqCourseEntry(new Course(dummyDepartment, dummyNumber, nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NAME)), nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION))), true));
            }
            else {
                result.reqs.get(result.reqs.size() - 1).add(new ReqCourseEntry(new Course(dummyDepartment, dummyNumber, nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_NAME)), nestedCursor.getString(nestedCursor.getColumnIndexOrThrow(DegreePlanAdapter.CourseEntry.COURSE_DESCRIPTION))), false));
            }
        }
        cursor.close();
        dbRead.close();
        return result;
    }

    //Test purposes only
    public static String PrintRequiredCourse(Context context, String department, int number){
        DegreePlanAdapter.FeedReaderDbHelper mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(context);

        SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();
        String text = "";
        int key = 0;
        String courseDepartment="";
        int courseNumber=-1;
        String[] projection = {
                DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT,
                DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER,
                DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT,
                DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER,
                DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY
        };

        String selection = DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT + " = ? AND " + DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER + " = ?";
        String[] selectionArgs = {department, Integer.toString(number)};

        Cursor cursor = dbRead.query(
                DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME,
                projection,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        while(cursor.moveToNext()) {
            text+=cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequisiteCourseTable.COURSE_DEPARTMENT));
            text+=" ";
            text+=cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequisiteCourseTable.COURSE_NUMBER));
            text+=" ";
            text+=cursor.getString(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_DEPARTMENT));
            text+=" ";
            text+=cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_COURSE_NUMBER));
            text+=" ";
            text+=cursor.getInt(cursor.getColumnIndexOrThrow(DegreePlanAdapter.RequisiteCourseTable.REQUISITE_KEY));
            text+="\n";
        }

        cursor.close();
        dbRead.close();
        return text;
    }

    public static void DeleteAllEntries(View view){

        DegreePlanAdapter.FeedReaderDbHelper mDbHelper = new DegreePlanAdapter.FeedReaderDbHelper(view.getContext());
        SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();
        dbRead.execSQL("DELETE FROM " + DegreePlanAdapter.CourseEntry.TABLE_NAME);

        dbRead.execSQL("DELETE FROM " + DegreePlanAdapter.ElectiveTable.TABLE_NAME);

        dbRead.execSQL("DELETE FROM " + DegreePlanAdapter.DegreePlanTable.TABLE_NAME);

        dbRead.execSQL("DELETE FROM " + DegreePlanAdapter.RequiredCourseTable.TABLE_NAME);

        dbRead.execSQL("DELETE FROM " + DegreePlanAdapter.RequisiteCourseTable.TABLE_NAME);
    }
}