# bucketstudy-backend
Backend for the BucketStudy platform using Spring Boot

⚠️ Do not add .gitignore or license just yet — we’ll set that up manually in VS Code.

## 🚀 Project Overview  

**Frontend:** React.js with Next.js  
**Backend:** Spring Boot (Java)  
**Database:** MongoDB (Atlas Free Tier)  
**Authentication:** JWT + BCrypt  
**File Storage:** Cloudinary (Free Tier)  
**Deployment:** Vercel (Frontend) + Railway/Render (Backend)  

---

## 👥 Team Members  

- **Ganpat Kumar** – Team Leader & Backend Developer  
- **Sushant Jadhav** – Full Stack Developer  
- **Prathmesh** – Frontend Developer  
- **Dhishank** – Frontend Developer  
- **Shakshi Bhor** – UI/UX & Frontend Developer  
- **Subhangi Ahir** – UI/UX & Frontend Developer  

---

## 📌 Phase 1: Foundation & Setup (Week 1–2)  

- Initialize Spring Boot project using **Spring Initializr**  
- Set up package structure (`controller`, `model`, `repository`, `service`, `config`, `dto`)  
- Configure `application.properties` with MongoDB URI, JWT secret, Cloudinary keys  
- Connect **Spring Boot ↔ MongoDB Atlas**  
- Add dependencies:  
  - `spring-boot-starter-web`  
  - `spring-boot-starter-data-mongodb`  
  - `spring-boot-starter-security`  
  - `jjwt`  
  - `cloudinary`  
  - `spring-boot-starter-mail`  

---

## 📌 Database Schema (Spring Boot Models)  

### User Model  
- name  
- email (unique)  
- password (hashed with BCrypt)  
- role (Enum: STUDENT, ADMIN, INSTRUCTOR)  
- profileImage  
- enrollmentDate  
- coursesEnrolled (List<ObjectId>)  
- certificates (List<ObjectId>)  

### Course Model  
- title  
- description  
- duration (hours)  
- instructor (ObjectId)  
- skills (List<String>)  
- price  
- videoLectures (List<String>)  
- assignments, projects  

### Internship Model  
- title  
- company  
- duration  
- requirements (List<String>)  
- applicationDeadline (Date)  
- selectedStudents (List<ObjectId>)  
- status  

### Challenge Model  
- title  
- description  
- prizePool  
- registrationFee  
- teamSize (min/max)  
- startDate, endDate  
- participants (teams, members, submissions)  
- winners (List<ObjectId>)  

---

## 📌 Authentication System (Spring Security + JWT)  

- User registration (`/api/auth/register`)  
- User login (`/api/auth/login`)  
- JWT token generation & validation  
- Password hashing with BCrypt  
- Role-based route protection  

---

## 📌 Frontend Setup (Next.js + Tailwind)  

- Project setup with **Next.js + TypeScript**  
- Tailwind CSS + shadcn/ui for UI  
- Folder structure: `components`, `pages`, `hooks`, `utils`  
- Axios for API calls  
- React Hook Form + Zod for validation  

Core Components:  
- Navbar, Footer, Layout wrapper  
- Loading + Error boundary components  

---

## 📌 Core Features (Week 3–4)  

- Authentication Pages: Login, Signup, Forgot Password, OAuth (Google/GitHub)  
- User CRUD (profile update, password reset, email verification)  
- Course System: CRUD, enrollment, progress tracking, certificate generation  
- Student Dashboard: progress cards, certificates, profile  
- Admin Dashboard: student management, course management, analytics  

---

## 📌 Advanced Features (Week 5–8)  

- **Challenge System:** CRUD, team registration, submissions, winners  
- **Analytics System:** user activity, course completion rates, revenue stats  
- **Notification System:** email, in-app, push notifications  
- **Chat/Forum System:** messaging, course discussions, Q&A  
- **Payment System:** Razorpay/Stripe integration  
- **Certificate System:** PDF generation, verification, QR codes  
- **Blog System:** CRUD, rich text editor, comments  
- **File Management:** Video/document uploads with Cloudinary  

---

## 📌 Technology Stack  

**Frontend:**  
- Next.js 14 (TypeScript)  
- Tailwind CSS + shadcn/ui  
- Zustand / Context API  
- Axios  
- React Hook Form + Zod  
- Chart.js / Recharts  

**Backend:**  
- Spring Boot (Java)  
- Spring Security + JWT + BCrypt  
- Spring Data MongoDB  
- JavaMailSender (Mail Service)  
- Cloudinary (File Storage)  

**DevOps & Deployment:**  
- Vercel (Frontend)  
- Railway / Render (Backend)  
- MongoDB Atlas (Database)  
- GitHub (Version Control)  

---

## 📌 Timeline  

- **Week 1–2:** Setup & Database Design  
- **Week 3–4:** Authentication + Core Features  
- **Week 5–6:** Dashboards (Student/Admin)  
- **Week 7–8:** Advanced Features (Payment, Certificates, Analytics)  
- **Week 9–10:** Testing + Deployment  

---

## ✅ Task Assignment Template  

**Task:** [Task Name]  
**Priority:** High/Medium/Low  
**Assigned To:** [Team Member]  
**Deadline:** [Date]  
**Dependencies:** [Other Tasks]  
**Description:** [Details]  
**Acceptance Criteria:**  
- [ ] Criterion 1  
- [ ] Criterion 2  
- [ ] Criterion 3  
